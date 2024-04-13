package hub;
import device.Device;
import device.S22;
import device.MP3;
import device.TV;
import hub.USBhub;
import usb.USB;
import usb.USBA;
import usb.USBC;


public class Lab06_1 {
	public static void printInfor(Device d) {
		System.out.println(d.getInfo());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("S22", 2022);
		MP3 mp3 = new MP3("MP3", 2005);
		TV tv = new TV("TV", 2017);
		
		Device[] devices = new Device[] {s22, mp3, tv};
		USBhub hub = new USBhub();
		
		for (Device d : devices) {
			printInfor(d);
			if (d instanceof USB)
				hub.addDevice((USB)d);
		}
		
		System.out.println();
		hub.readUSBs();
		hub.writeUSBs();

	}
}
