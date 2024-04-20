import java.util.Scanner;
public class Lab02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("name: ");
		String name = scanner.nextLine();
		
		System.out.println(age + " " + name);
		
	}

}
