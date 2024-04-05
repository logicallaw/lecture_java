interface PhoneInterface12{
	int TIMEOUT = 10000; //기본적으로 별말 없어도 상수다.
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("phone");
	}
	public protected void print();
	
}
public class Ex12 {
	public static void main(String[] args) {
	}

}
