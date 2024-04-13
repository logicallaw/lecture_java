interface PhoneInterface{
	public static final int TIMEOUT = 10;
	int AGE = 20;
	void receiveCall();
	private abstract void printLogo();
}
interface Samsung extends PhoneInterface{
	int JUN = 30;
}
abstract class JJ implements Samsung{
	abstract void sendCall();
}
class HH extends JJ{
	public void receiveCall() { //접근권한 줄일 수 없다!
	}
	void sendCall() {}
}
public class ex19 {
}
