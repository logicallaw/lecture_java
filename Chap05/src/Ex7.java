abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	public int sum() {
		int sum = 0;
		return sum;
	} //추상메서드가 아니면 body 작성가능
}
//자식클래스가 추상클래스 상속받으면 객체 생성하려면 모두 오버라이딩 해야한다.
public abstract class Ex7 extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
	@Override
	public int sum() {
		int sum = 0;
		System.out.print("자");
		return sum;
	}
	public static void main(String[] args) {
		Ex7 e = new Ex7();
		System.out.println(e.add(2, 3));
		System.out.println(e.subtract(2, 3));
		System.out.println(e.average(new int[] { 2, 3, 4}));
	}
}
