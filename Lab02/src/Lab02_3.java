import java.util.Scanner;
public class Lab02_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coordinates of a point (x, y): ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String message = "not in the rectangle";
		
		if (x >= 100 && x <= 200) {
			if (y >= 100 && y <= 200) {
				message = "inside the rectangle";
			}
		}
		
		System.out.println("(" + x + ", " + y + "): " + message);
	}
}
