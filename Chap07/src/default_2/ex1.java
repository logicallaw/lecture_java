package default_2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.print("? ");
		String userInput = scan.next();
		
		String maxString = userInput;
		int maxLength = userInput.length();
		
		while(!userInput.equals("exit")) {
			list.add(userInput);
			if (maxLength < userInput.length()) {
				maxString = userInput;
				maxLength = userInput.length();
			}
			System.out.print("? ");
			userInput = scan.next();
		}
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\nthe longest name: " + maxString);
	}

}
