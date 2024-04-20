import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		String s1 = new String(" dlwlrma");
		String s2 = new String(",pby ");
		s1.concat(s2);
		s1.trim();
		s1.replace("dlwlrma", "wooklee");
		System.out.println(s1);
	}
}
