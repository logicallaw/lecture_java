package usb;

import usb.USB;
import usb.USBA;
import usb.USBC;

public class USBhub{
	private USB[] hub;
	private int count;
	public USBhub() {
		hub = new USB[4];
		count = 0;
	}
	public void addDevice(USB device) {...}
	public void readUSBs() {...}
	public void writeUSBs() {...}	
}
