interface PhoneInterface{
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public void printLogo() {
		System.out.println("** Phone **");
	}
}
interface PhoneInterface1{
	int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	void printLogo() {
		System.out.println("** Phone **");
	}
}
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
