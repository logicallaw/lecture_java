package hub;
import usb.USB;
import usb.USBA;
import usb.USBC;

public class USBhub {
	//Field
	private USB[] hub;
	private int counter;
	//Constructor
	public USBhub() {
		hub = new USB[4];
		counter = 0;
	}
	//Method
	public void addDevice(USB d) {
		if(counter < hub.length) {
			hub[counter++] = d;
			if (d instanceof USBA) {
				((USBA)d).connectA();
			}
			else if (d instanceof USBC) {
				((USBC)d).connectC();
			}
		}
		else {
			System.out.println("fail to add usb.");
		}
	}
	public void readUSBs() {
		for (int i = 0; i < counter; i++) 
			(hub[i]).readUSB();
		System.out.println();
	}
	public void writeUSBs() {
		for (int i = 0; i < counter; i++) 
			(hub[i]).writeUSB();
	}
	
}