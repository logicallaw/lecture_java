import java.util.Scanner;

public class Lab03_3 {
	// If you enter "q", this program will be down.
	public static void main(String[] args) {
		// declare scanner.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your message.");
		System.out.print("q: quit the program.");

		// input a message.
		System.out.print("\n> ");
		String message = scanner.nextLine();

		// check the message.
		// If the message isn't "q", it is still working.
		while (!message.equals("q")) {
			System.out.print(message + "\n> ");
			message = scanner.nextLine();
		}

		System.out.print("\nBye!");
	}
}
