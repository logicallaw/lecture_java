import java.util.Scanner;
import java.math.*;
public class Lab02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Center of circle: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.print("Radius: ");
		double radius = scanner.nextDouble();
		
		System.out.print("Point: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		double distance = (x - a) * (x - a) + (y - b) * (y - b);
		distance = Math.sqrt(distance);
		
		
		String message = (distance <= radius)? "inside the circle" : "not in the circle.";
		System.out.println("(" + x + ", " + y + "): " + message);
	}

}
