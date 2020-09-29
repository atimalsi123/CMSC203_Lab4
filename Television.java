/** 
*The purpose of this class is to model a television
*Alisha Timalsina and 09/25/2020
*/

public class Television {
	private final String MANUFACTURER; // holds the brand name
	private final int SCREEN_SIZE; // holds the size of the television screen
	private boolean powerOn; // holds the value true if the power is on, and false if the power is off
	private int channel; // holds the value of the station that the television is showing
	private int volume; // holds a number value represents the loudness
	
	// Bring in information
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		this.powerOn = false;
		this.volume = 20;
		this.channel = 2;
	}
	/**
	 * returns the value of volume
	 * @return
	 */
	public int getVolume(){
		return this.volume;
	}
	/**
	 * returns the value of channel
	 * @return
	 */
	public int getChannel() {
		return this.channel;
	}
	/**
	 * returns the value of MANUFACTURER
	 * @return
	 */
	public String getManufacturer() {
		return this.MANUFACTURER;
	}
	/**
	 * returns the SCREEN_SIZE
	 * @return
	 */
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
	/**
	 * Accepts station to be stored on channel
	 * @return
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * power changing from true to false
	 * @return
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * increases the volume by 1
	 * @return
	 */
	public void increaseVolume() {
		this.volume++;
	}
	/**
	 * decreases the volume by 1
	 * @return
	 */
	public void decreaseVolume() {
		this.volume--;
	}
}
