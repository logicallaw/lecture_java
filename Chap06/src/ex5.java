
public class ex5 {
	public static void main(String[] args) {
		int counter = 0;
		String a = "class";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 's') {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
