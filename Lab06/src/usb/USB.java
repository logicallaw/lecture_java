package usb;

public interface USB{
	void readUSB(); //abstract method
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
