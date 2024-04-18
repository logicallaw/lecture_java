package default_2;
import java.util.Scanner;
import java.lang.Math;
import java.util.StringTokenizer;
public class ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a string:");
		String userInput = scan.nextLine();
		int startIndex = (int)(Math.random()*(userInput.length()) + 1);
		userInput = userInput.substring(startIndex);
		StringTokenizer st = new StringTokenizer(userInput," ");
		int words = st.countTokens();
		System.out.println("startIndex = " + startIndex + ", #words = " + words);
		System.out.println(userInput);
	}
}
