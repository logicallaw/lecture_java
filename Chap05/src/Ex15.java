class BaseTmp{
	public void Hello(){ System.out.println("Hello"); }
}

class DerivedTmp extends BaseTmp{
	@Override
	public void Hello() { System.out.println("HI"); }
}
public class Ex15 {
	public static void main(String[] args) {
		BaseTmp bt1 = new DerivedTmp(); //업캐스팅
		bt1.Hello(); //업캐스팅된 오버라이딩이라 HI 출력을 예상함.->HI 출력됨.
	}

}
