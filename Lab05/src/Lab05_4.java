interface USB_4{
	void readUSB(); //abstract method
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
interface USBA_4 extends USB_4 {
	void connectA(); //abstract method 
}
interface USBC_4 extends USB_4 {
	void connectC(); //abstract method
}

class S22_4 implements USBC_4 {
	/*
	You MUST redefine 2 methods.
	:readUSB, connectC
	*/
	@Override
	public void readUSB() {
		System.out.println(name + ": USB read");
	}
	@Override
	public void connectC() {
		System.out.println(name + ": USB-C connected");
	}
	@Override
	public void writeUSB() {
		System.out.println(name + ": USB write");
	}
	//Field
	String name;
	//Constructor
	public S22_4(String name) {
		this.name = name;
	}
}

class MP3_4 implements USBA_4{
	/*
	You MUST redefine 2 methods.
	:readUSB, connectA
	*/
	@Override
	public void readUSB() {
		System.out.println(name + ": USB read");
	}
	@Override
	public void connectA() {
		System.out.println(name + ": USB-A connected");
	}
	//Field
	String name;
	//Constructor
	public MP3_4(String name) {
		this.name = name;
	}
}
public class Lab05_4 {
	public static void connect(USB_4 u) {
		//Type check for downcasting
		if (u instanceof USBA_4) {
			((USBA_4)u).connectA();
		}
		else if (u instanceof USBC_4) {
			((USBC_4)u).connectC();
		}
	}
	public static void readUSB(USB_4 u) {
		//Type check for downcasting
		u.readUSB(); //Call overriding method.
	}
	public static void writeUSB(USB_4 u) {
		//Type check for downcasting
		u.writeUSB(); //Call overriding method.
	}
	
	public static void main(String[] args) {
		S22_4 s22 = new S22_4("S22");
		MP3_4 mp3 = new MP3_4("MP3");
		
		USB_4[] hub = new USB_4[] { s22, mp3 }; //Upcasting
		for (USB_4 u : hub) {
			connect(u);
			readUSB(u);
			writeUSB(u);
		}
	}
}