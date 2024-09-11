import java.util.Random;
public class Q7 {
	// function for getting total
	static int getTotal(int arr[][]) {
		System.out.println("Total value of array");
		
		int total = 0; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		return total;
	}
	//function for getting average
	static int getAverage(int arr[][]) {
		System.out.println("Average value of array");

		int avg = 0; int total = 0; int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				counter++;
			}
		}
		avg = total/counter;
		return avg;
	}
	
	//function for getting row total
	static int getRowTotal(int arr[][], int row) {
		System.out.println("Total of row");

		int total = 0;
		for (int j = 0; j < arr[row].length; j++) {
			total += arr[row][j];
		}
		return total;
	}
	
	//function for getting col total
	static int getColTotal(int arr[][], int col) {
		System.out.println("Total of column");

		int total = 0;
		for (int j = 0; j < arr.length; j++) {
			total += arr[j][col];
		}
		return total;
	}
	
	//function for getting highest value in the row
	static int getHighestInRow(int arr[][], int row) {
		int high = 0;
		System.out.println("Highest values of row " + row);

		for (int j = 0; j < arr[row].length; j++) {
				if (high < arr[row][j]) {
					high = arr[row][j];
				}
			}
		return high;
	}
	
	//function for getting lowest value in the row
	static int getLowestInRow(int arr[][], int row) {
		int low = 100;
		System.out.println("Lowest values of row " + row);

		for (int j = 0; j < arr[row].length; j++) {
				if (low > arr[row][j]) {
					low = arr[row][j];
				}
			}
		return low;
	}
	
	static public void main(String[] arg) {
		Random rand = new Random();
		int rows = 3; int cols = 4;
		int rand_range = 101;
		int arr2D[][] = new int[rows][cols];
		//putting value into 2d array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr2D[i][j]= rand.nextInt(rand_range);
			}
		}
		//print out the original array
		System.out.println("Array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();

		}
		//print out the total of array
		System.out.println();
		System.out.println(getTotal(arr2D));
		
		//print out the average of array
		System.out.println();
		System.out.println(getAverage(arr2D));
		
		//print out the total of each row
		System.out.println();
		System.out.println(getRowTotal(arr2D, 1));
		
		//print out the total of each col
		System.out.println();
		System.out.println(getColTotal(arr2D, 1));
		
		//print out the highest in the row
		System.out.println();
		System.out.println(getHighestInRow(arr2D, 1));
		
		//printing our the lowest in the row
		System.out.println();
		System.out.println(getLowestInRow(arr2D, 1));
		
	}
}
