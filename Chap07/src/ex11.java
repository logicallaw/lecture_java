interface USB_4{
	void readUSB(); //public abstract ft.
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
interface USBA_4 extends USB_4{
	void connectA(); //public abstract ft.
}
interface USBC_4 extends USB_4{
	void connectC(); //public abstract ft.
}

class S22_4 implements USBC_4{
	//Overriding
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
		System.out.println(name+ ": USB write");
	}
	//Field
	private String name;
	//Constructor
	public S22_4(String name) {
		this.name = name;
	}
}

class MP3_4 implements USBA_4{
	//Overriding
	@Override
	public void readUSB() {
		System.out.println(name + ": USB read");
	}
	@Override
	public void connectA() {
		System.out.println(name + ": USB-A connected");
	}
	
	//Field
	private String name;
	
	//Constructor
	public MP3_4(String name) {
		this.name = name;
	}
	
}
public class ex11{
	public static void connect(USB_4 u) {
		if (u instanceof S22_4) {
			((S22_4)u).connectC();
		}
		else if (u instanceof MP3_4) {
			((MP3_4)u).connectA();
		}
		else {
			System.out.println("Can't find type");
		}
	}
	public static void readUSB(USB_4 u) {
		u.readUSB();
	}
	public static void writeUSB(USB_4 u) {
		u.writeUSB();
	}
	public static void main(String[] args) {
		S22_4 s22 = new S22_4("s22");
		MP3_4 mp3 = new MP3_4("mp3");
		
		USB_4[] hub = new USB_4[] {s22, mp3};
		
		for (USB_4 u : hub) {
			connect(u);
			readUSB(u);
			writeUSB(u);
		}
		
	}
}