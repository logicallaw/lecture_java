class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class ex16 extends Shape {
	protected String name;
	@Override
	public void paint() { 
		name = "ex16";
		super.name = "Shape";
		super.draw(); //Shape
		System.out.println(name); //ex16
	}
	@Override
	public void draw() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape b = new ex16();
		b.paint();
	}

}
