////interface-not create Object.
//interface USB_4{
//	void readUSB();
//	default void writeUSB() {
//		System.out.println("Can't write to USB");
//	}
//}
////interface-not create Object.
//interface USBA_4 extends USB_4{
//	void connectA();
//}
////interface-not create Object.
//interface USBC_4 extends USB_4{
//	void connectC();
//}
////S22 MUSH do overriding All abstract methods.
///* You must implements the lists below.
//* public void readUSB();
//* public void connectC();
//*/
//class S22_4 implements USBC_4{
//	private String name;
//	public S22_4(String name) {
//		this.name = name;
//	}
//	@Override
//	public void readUSB() {
//		System.out.println(name + ": USB read");
//	}
//	@Override
//	public void connectC() {
//		System.out.println(name + ": USB-C connected");
//	}
//	//I will override public default void writeUSB().
//	@Override
//	public void writeUSB() {
//		System.out.println(name + ": USB write");
//	}
//}
////MP3 MUSH override All abstract methods.
///* You must implements the lists below.
//* public void readUSB();
//* public void connectA();
//*/
//class MP3_4 implements USBA_4{
//	private String name;
//	public MP3_4(String name) {
//		this.name = name;
//	}
//	@Override
//	public void readUSB() {
//		System.out.println(name + ": USB read");
//	};
//	@Override
//	public void connectA() {
//		System.out.println(name + ": USB-A connected");
//	}
//}
//public class Lab05_4_1 {
//	//Global function:connect, readUSB, writeUSB
//	public static void connect(USB_4 u) {
//		if (u instanceof S22_4) 
//			((S22_4)u).connectC();
//		else 
//			((MP3_4)u).connectA();
//	}
//	public static void readUSB(USB_4 u) {
//		if (u instanceof S22_4)
//			((S22_4)u).readUSB();
//		else
//			((MP3_4)u).readUSB();
//	}
//	public static void writeUSB(USB_4 u) {
//		if (u instanceof S22_4) 
//			((S22_4)u).writeUSB();
//		else 
//			u.writeUSB();
//	}
//	//main function.
//	public static void main(String[] args) {
//		S22_4 s22 = new S22_4("S22");
//		MP3_4 mp3 = new MP3_4("MP3");
//		
//		USB_4[] hub = new USB_4[] {s22, mp3}; //Provide only USB_4 Type, not Object.
//		for (USB_4 u : hub) {
//			connect(u);
//			readUSB(u);
//			writeUSB(u);
//		}
//	}
//}
//
