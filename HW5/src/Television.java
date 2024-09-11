//The purpose of this class is to model a television
//Minayo Stotz 6/21/2023
public class Television {
	String MANUFACTURER;	//The name of manufacture
	int SCREEN_SIZE;		//The size of screen
	boolean powerOn;		//The statement of power
	int channel;			//The number of channel
	int volume;				//The number of volume
	
	Television(String brand, int size){
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	/**This function set the channel 
	 * store the parameter to the channel
	 * @param station*/
	public void setChannel(int station) {channel = station;}
	/**This function will change the statement of powerOn
	 * if the powerOn is true, powerOn will be false
	 * if the powerOn is false, powerOn will be true
	 */
	public void power() {
		if (!powerOn) {powerOn = true;}
		else {powerOn = !powerOn;}
	}
	/**This function increase the volume by 1*/
	public void increaseVolume() { volume++; }
	/**This function decrease the volume by 1*/
	public void decreaseVolume() { volume--; }
	/**This function will return the channel*/
	public int getChannel() {return channel;}
	/**This function will return the volume*/
	public int getVolume() {return volume;}
	/**This function will return the MANUFACTURE*/
	public String getManufacturer() {return MANUFACTURER;}
	/**This function will return the SCREEN_SIZE*/
	public int getScreenSize() {return SCREEN_SIZE;}
}
