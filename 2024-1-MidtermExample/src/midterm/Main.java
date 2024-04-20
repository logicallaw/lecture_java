package midterm;

import usb.USBhub;
import device.Device;
import device.MP3;
import device.S22;
import device.TV;
import usb.USB;

public class Main {
	public static void printInfor(Device d) {
		System.out.println(d.getInfor());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("s22", 2022);
		MP3 mp3 = new MP3("mp3", 2017);
		TV tv = new TV("tv", 2019);
		
		Device[] devices = new Device[] {s22, mp3, tv};
		USBhub hub = new USBhub();
		for(Device d : devices) {
			printInfor(d);
			if(d instanceof USB) {
				hub.addDevice((USB)d);
			}
		}
		System.out.println();
		hub.readUSBs();
		hub.writeUSBs();
	}

}
