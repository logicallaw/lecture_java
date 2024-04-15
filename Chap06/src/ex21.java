import java.lang.Math;
public class ex21 {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			int n = (int)(Math.random()*100 + 1);
//			System.out.println(n);
//		}
		double e = Math.PI;
		System.out.println(Math.ceil(e));
		System.out.println(Math.abs(-12.2));
		System.out.println(Math.exp(2));
		System.out.println(Math.max(2, -2));
		System.out.println(Math.floor(e));
		System.out.println(Math.round(e)); //반올림
		System.out.println(Math.sqrt(2)); //제곱근
		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random()*45+1));
		}
	}

}
