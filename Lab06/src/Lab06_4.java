public class Lab06_4 {
	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 300;
		Integer i4 = 300;
		
		if (i1 == i2) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		if (i3 == i4) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		
		long t = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i < 6000000; i++) {
			sum += i;
		}
		System.out.println((System.currentTimeMillis() - t) + "ms");
		
		t = System.currentTimeMillis();
		Long sumLong = 0L;
		for (int i = 0; i < 6000000; i++) {
			sumLong += i;
		}
		System.out.println((System.currentTimeMillis() - t) + "ms");
	}
}
//

