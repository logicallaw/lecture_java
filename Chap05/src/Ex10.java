abstract class Tmp3{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public default void print() {
		System.out.println("default method");
	}
}

class test1 extends Tmp3{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	
}
public class Ex10 {
	public static void main(String[] args) {
		test1 t1 = new test1();
	}
}
