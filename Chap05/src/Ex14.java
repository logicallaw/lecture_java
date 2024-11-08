interface PhoneInterface14{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("*** Phone ***");
	}
}
interface MobilePhoneInterface extends PhoneInterface14{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
	
}
class PDA{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements
MobilePhoneInterface, MP3Interface{
	@Override //MobilePhoneInterface 추상 메서드 구현
	public void sendCall() {
		System.out.println("따르릉 따르릉...");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	
	//MP3Interface 추상메서드 구현
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}
	//추가로 작성한 SmartPhone 클래스의 메서드
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
}
public class Ex14 {
	public static void main(String[] args) {
		//참조변수 생성, 객체 생성
		SmartPhone phone = new SmartPhone(); //자동으로 객체 생성
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + 
				phone.calculate(3, 5));
		phone.schedule();
		}

}
