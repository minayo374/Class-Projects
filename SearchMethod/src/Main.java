import java.util.*;
import java.io.*;

public class Main {
	static Map<String, City> cities = new HashMap<>();
	
	public static void main(String[] args) {
		loadCities("coordinates.csv");
		loadAdjacencies("Adjacencies.txt");
		List<City> fastestRoute = null;
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter the starting city: ");
			String start = scan.nextLine();
			
			if (!cities.containsKey(start)) {
				System.out.println("Invalid city name.");
				continue;
			}
			
			System.out.println("Enter the endind city: ");
			String end = scan.nextLine();
			if(!cities.containsKey(end)) {
				System.out.println("Invalid city name.");
				continue;
			}
			
			System.out.println();
			System.out.println("------------------------------------------------------");
			System.out.println("Select the search method: ");
			System.out.println("1. undirected(blind)brute-force approach");
			System.out.println("2. breadth-first search");
			System.out.println("3. depth-first search");
			System.out.println("4. ID-DFS search");
			System.out.println("5. best-first search");
			System.out.println("6. A* search");
			
			String method = scan.nextLine();
			System.out.println("------------------------------------------------------");
			System.out.println();
			
			//start counting execution time
			long startTime = System.nanoTime();

			switch(method) {
			case "1":
				fastestRoute = undirectedBruteForce(cities, start, end);
				
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			case "2":
				fastestRoute = breadthFirst(cities, start, end);
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			case "3":
				fastestRoute = depthFirst(cities, start, end);
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			case "4":
				fastestRoute = idDfsSearch(cities, start, end);
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			case "5":
				fastestRoute = bestFirst(cities, start, end);
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			case "6":
				fastestRoute = A(cities, start, end);
				if (fastestRoute != null) {
					fastestRoute.forEach(city -> System.out.println(city.name));
				}
				else {System.out.println("No route found.");}
				break;
				
			default:
				System.out.println("Invalid method");
			}
			
			System.out.println();
			
			//finish counting
			long endTime = System.nanoTime();
			//calculate the execution time
			double executionTime = (endTime - startTime) / 1000000.0;
			System.out.println("Execution time: " + String.format("%,.2f", executionTime) + "ms");
			
			//calculate the total distance 
			double total = totalDistance(fastestRoute);
			System.out.println("Total distance: " + String.format("%,.2f", total) + "km");
			
			
			System.out.println();
			System.out.println("Do you want to keep playing? (y or n)");
			String inp = scan.nextLine();
			if (inp.equals("n") || inp.equals("N")) {
				flag = false;
			}
		}
	}
	
	//this is a function for reading coordinate.csv and the read items will be in stored in the Map City. 
	//the key is the name of the city and values are City object.
	static void loadCities(String filename) {
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				double latitude = Double.parseDouble(parts[1]);
				double longtitude = Double.parseDouble(parts[2]);
				cities.put(name, new City(name, latitude, longtitude));
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//this function is to read Adjacencies.text. the loaded item will be in the list in the City Object.
	static void loadAdjacencies(String filename) {
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
				City city1 = cities.get(parts[0]);
				City city2 = cities.get(parts[1]);
				if (city1 != null && city2 != null) {
					city1.adjacentCities.add(city2);
					city2.adjacentCities.add(city1);
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//undirected brute force method for finding a fastest route. 
	public static List<City> undirectedBruteForce(Map<String, City> cities, String startCityName, String endCityName){
		City startCity = cities.get(startCityName);
		City endCity = cities.get(endCityName);
		
		//if the start city and end city are empty return null
		if (startCity == null || endCity == null) {return null;}
		
		//Stack<City> manage the cities to visit
		Stack<List<City>> stack = new Stack<>();
		//HashSet<City> keep track of visited cites
		Set<City> visited = new HashSet<>();
		
		//List<City> represent the fastest route
		List<City> initialPath = new ArrayList<>();
		initialPath.add(startCity);
		stack.push(initialPath);
		
		while (!stack.isEmpty()) {
			List<City> currentPath = stack.pop();
			City currentCity = currentPath.get(currentPath.size() - 1);
			
			//if the current city is end city return the current path
			if (currentCity.equals(endCity)) {return currentPath;}
			
			if (visited.add(currentCity)) {
				for (City adjacentCity : currentCity.adjacentCities) {
					if (!visited.contains(adjacentCity)) {
						List<City> newPath = new ArrayList<>(currentPath);
						newPath.add(adjacentCity);
						stack.push(newPath);
					}
				}
			}
		}
		return null;
	}
	
	//breadth-first method
	static List<City>  breadthFirst(Map<String, City> cities, String startCityName, String endCityName) {
		City startCity = cities.get(startCityName);
		City endCity = cities.get(endCityName);
		
		//if the start city and end city are empty return null
		if (startCity == null || endCity == null) {return null;}
		
		//Queue<City> manage the cities to visit
		Queue<List<City>> queue = new LinkedList<>();
		//HashSet<City> keep track of visited cites
		Set<City> visited = new HashSet<>();
		
		//List<City> represent the fastest route
		List<City> initialPath = new ArrayList<>();
		initialPath.add(startCity);
		queue.offer(initialPath);
		
		while (!queue.isEmpty()) {
			List<City> currentPath = queue.poll();
			City currentCity = currentPath.get(currentPath.size() - 1);
			
			//if the current city is end city return the current path
			if (currentCity.equals(endCity)) {return currentPath;}
			
			if (visited.add(currentCity)) {
				for (City adjacentCity : currentCity.adjacentCities) {
					if (!visited.contains(adjacentCity)) {
						List<City> newPath = new ArrayList<>(currentPath);
						newPath.add(adjacentCity);
						queue.offer(newPath);
					}
				}
			}
		}
		return null;
	}
	
	//depth first method
	static List<City> depthFirst(Map<String, City> cities, String startCityName, String endCityName){
		City startCity = cities.get(startCityName);
		City endCity = cities.get(endCityName);
		
		//if the start city and end city are empty return null
		if (startCity == null || endCity == null) {return null;}
		
		//Stack<City> manage the cities to visit
		Stack<List<City>> stack = new Stack<>();
		//HashSet<City> keep track of visited cites
		Set<City> visited = new HashSet<>();
		
		//List<City> represent the fastest route
		List<City> initialPath = new ArrayList<>();
		initialPath.add(startCity);
		stack.push(initialPath);
		
		while (!stack.isEmpty()) {
			List<City> currentPath = stack.pop();
			City currentCity = currentPath.get(currentPath.size() - 1);
			
			//if the current city is end city return the current path
			if (currentCity.equals(endCity)) {return currentPath;}
			
			if (visited.add(currentCity)) {
				for (City adjacentCity : currentCity.adjacentCities) {
					if (!visited.contains(adjacentCity)) {
						List<City> newPath = new ArrayList<>(currentPath);
						newPath.add(adjacentCity);
						stack.push(newPath);
					}
				}
			}
		}
		return null;
	}
	
	//there are two functions in order to achieve ID DFS search
	//function 1: idDfsSearch
	static public List<City> idDfsSearch(Map<String, City> cities, String startCityName, String endCityName){
		City startCity = cities.get(startCityName);
        City endCity = cities.get(endCityName);
        if (startCity == null || endCity == null) return null;

        int depth = 0;
        while (true) {
            Set<City> visited = new HashSet<>();
            List<City> path = idDfs(startCity, endCity, depth, visited);
            if (path != null) return path;
            depth++;
        }
	}
	
	//function 2: idDfs
	static private List<City> idDfs(City current, City end, int depth, Set<City> visited){
		if (depth == 0 && current.equals(end)) {
            List<City> path = new ArrayList<>();
            path.add(current);
            return path;
        }
        if (depth > 0) {
            visited.add(current);
            for (City adjacent : current.adjacentCities) {
                if (!visited.contains(adjacent)) {
                    List<City> path = idDfs(adjacent, end, depth - 1, visited);
                    if (path != null) {
                        path.add(0, current);
                        return path;
                    }
                }
            }
            visited.remove(current);
        }
        return null;
	}
	
	//there are two functions in order to accomplish best-first search
	//bestFirst
	static public List<City> bestFirst(Map<String, City> cities, String startCityName, String endCityName) {
		City startCity = cities.get(startCityName);
        City endCity = cities.get(endCityName);
        
        if (startCity == null || endCity == null) return null; // Return null if start or end city is not found
        
        PriorityQueue<City> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(startCity::distance));
        Set<City> visited = new HashSet<>();
        Map<City, City> cameFrom = new HashMap<>(); // To reconstruct the path
        
        priorityQueue.add(startCity);
        
        while (!priorityQueue.isEmpty()) {
            City current = priorityQueue.poll();
            if (visited.contains(current)) continue;
            
            visited.add(current);
            
            if (current.equals(endCity)) {
                return reconstructPath(cameFrom, startCity, endCity);
            }
            
            for (City neighbor : current.adjacentCities) {
                if (!visited.contains(neighbor)) {
                    cameFrom.put(neighbor, current);
                    priorityQueue.add(neighbor);
                }
            }
        }
        return null; // Return null if no path is found between start and end city
	}
	
	//A* method
	public static List<City> A(Map<String, City> cities, String startCityName, String endCityName){
		 City startCity = cities.get(startCityName);
	        City endCity = cities.get(endCityName);
	        
	        if (startCity == null || endCity == null) return null;

	        PriorityQueue<City> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(c -> (c.distance(endCity))));
	        Map<City, City> cameFrom = new HashMap<>();
	        Map<City, Double> gValues = new HashMap<>();
	        
	        priorityQueue.add(startCity);
	        gValues.put(startCity, 0.0);
	        
	        while (!priorityQueue.isEmpty()) {
	            City current = priorityQueue.poll();

	            if (current.equals(endCity)) {
	                return reconstructPath(cameFrom, startCity, endCity);
	            }
	            
	            for (City neighbor : current.adjacentCities) {
	                double tentativeGValue = gValues.get(current) + current.distance(neighbor);
	                if (tentativeGValue < gValues.getOrDefault(neighbor, Double.MAX_VALUE)) {
	                    cameFrom.put(neighbor, current);
	                    gValues.put(neighbor, tentativeGValue);
	                    priorityQueue.add(neighbor);
	                }
	            }
	        }
	        
	        return null;
	}
	
	// this function will be used for bestFirst and A*
	private static List<City> reconstructPath(Map<City, City> cameFrom, City startCity, City endCity){
		List<City> path = new ArrayList<>();
        for (City at = endCity; at != null; at = cameFrom.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return path;
	}
	
	//calculating the total distance from the route.
	public static double totalDistance(List<City> path) {
		int counter = 0;
		double totalDistance = 0;
		
		while ((counter + 1) != path.size()) {
			City city1 = path.get(counter);
			City city2 = path.get(counter + 1);
			totalDistance += city1.distance(city2);
			
			counter++;
		}
		return totalDistance;
	}
}
