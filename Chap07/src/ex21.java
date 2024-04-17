import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.Math;
public class ex21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput;
		
		System.out.print("Input a string: ");
		userInput = scan.nextLine();
		int startIndex = (int)(Math.random()*(userInput.length()));
		userInput = userInput.substring(startIndex);
		StringTokenizer st = new StringTokenizer(userInput, " ");
		int words = st.countTokens();
		
		System.out.println("startIndex = " + startIndex + ", #words = " + words);
		System.out.println(userInput);
		// Bart, don't make fun of grad students. They jush made a terrible life choice...
	}
}
