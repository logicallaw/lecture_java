package default_3;
import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " < " + s2);
		}
		else if (s1.compareTo(s2) == 0) {
			System.out.println(s1 + " == " + s2);
		}
		else {
			System.out.println(s1 + " > " + s2);
		}
	}

}
