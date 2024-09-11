import java.util.ArrayList;
import java.util.List;

public class City {
	String name;
	double latitude;
	double longitude;
	List<City> adjacentCities;
	
	public City(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.adjacentCities = new ArrayList<>();
	}
	
	public double distance(City other) {
		double lat1 = this.latitude;
	    double lon1 = this.longitude;
	    double lat2 = other.latitude;
	    double lon2 = other.longitude;
	        
	    double dLat = Math.toRadians(lat2 - lat1);
	    double dLon = Math.toRadians(lon2 - lon1);
	    lat1 = Math.toRadians(lat1);
	    lat2 = Math.toRadians(lat2);
	      
	    double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
	    double c = 2 * Math.asin(Math.sqrt(a));
	        
	    double R = 6371; // Earth's radius in kilometers
	    return R * c;	}
}
