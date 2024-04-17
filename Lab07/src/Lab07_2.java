import java.util.Scanner;
import java.util.ArrayList;
public class Lab07_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.print("? ");
		String userInput = scan.next();
		
		String stringMax = userInput;
		int indexMax = userInput.length();
		
		while(!userInput.equals("exit")) {
			list.add(userInput);
			if(indexMax < userInput.length()) {
				stringMax = userInput;
			}
			System.out.print("? ");
			
			userInput = scan.next();
		}
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println("\nthe longest name: " + stringMax);
		scan.close();
	}

}
