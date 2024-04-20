package default_4;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a string:");
		String userInput = scan.nextLine();
		int startIndex = (int)(Math.random() * (userInput.length()));
		userInput = userInput.substring(startIndex);
		StringTokenizer st = new StringTokenizer(userInput, " ");
		int words = st.countTokens();
		System.out.println("startIndex = " + startIndex + ", #words = " + words);
		System.out.println(userInput);
		//  Bart, don't make fun of grad students. They just made a terrible life choice...
	}

}
