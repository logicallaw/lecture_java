package default_4;
import java.util.ArrayList;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("? ");
		String userInput = scan.next();
		String maxStr = userInput;
		while(!userInput.equals("exit")) {
			maxStr = (maxStr.length() < userInput.length()) ? userInput : maxStr;
			list.add(userInput);
			System.out.print("? ");
			userInput = scan.next();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("the longest name: " + maxStr);
	}

}
