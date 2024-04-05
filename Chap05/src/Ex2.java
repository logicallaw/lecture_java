//class Point{
//	private int x, y;
//	public Point() {
//		this.x = this.y = 0;
//	}
//	public Point(int x,int y) {
//		this.x = x; this.y = y;
//	}
//	public void showPoint() {
//		System.out.println(x + " " + y);
//	}
//}
//class ColorPoint extends Point{
//	private String colorName;
//	public ColorPoint(int x, int y, String colorName) {
//		super(x,y);
//		this.colorName = colorName;
//	}
//	public void showColorPoint() {
//		System.out.println(colorName);
//		showPoint(); //부모클래스의 메서드를 호출할 수 있다.
//		//이때, this를 사용하지 않고 클래스 내부라서 바로 호출이 가능하다.
//		
//	}
//}
//public class Ex2 {
//	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5,6,"blue");
//		//내부적으로 자식클래스는 객체 생성시 생성자 호출하는데
//		//해당 생성자는 부모 super(x,y)의 생성자를 호출하고
//		//부모 생성자가 호출되어 실행되면서 x와 y값을 저장한다.
//		//이후 자식생성자가 실행되면서 객체가 생성된다.
//		cp.showColorPoint();
//	}
//}
