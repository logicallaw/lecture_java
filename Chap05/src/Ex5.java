//메서드 오버라이딩 연습
class Shape1{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Ex5 extends Shape1{
	protected String name;
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		Shape1 b = new Ex5(); //업스캐스팅
		b.paint(); //오버라이딩
	}

}
