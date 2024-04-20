package usb;

public interface USB {
	//print->deviceName: USB read
	//ex) S22: UBS read
	void readUSB();
	
	//print->deviceName: USB write
	//ex)S22: USB write
	//or ex)Can't write to USB
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
