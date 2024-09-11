
public class UseAuto {
	static public void main(String[] arg) {
		BMW bmw = new BMW("BMW X1");
		Ford ford = new Ford("EcoSport S");
		
		System.out.println(bmw.getMake() + ": $" + bmw.getPrice());
		System.out.println(ford.getMake() + ": $" + ford.getPrice());
	}
}
