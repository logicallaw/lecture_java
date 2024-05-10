
public class Ex1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long c = 1000000000000000l;
		while(c > 0) {c--;}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
