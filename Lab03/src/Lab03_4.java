import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab03_4 {
	public static void main(String[] args) {
		// declare scanner.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 6 integers one by one.");

		// declare i array.
		int i[][] = new int[2][3];

		// input 6 integers one by one.
		for (int a = 0; a < i.length; a++) {
			for (int b = 0; b < i[a].length; b++) {
				try {
					System.out.print("> ");
					i[a][b] = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Not an integer!");
					scanner.nextLine(); //
					b--;
				}
			}
		}

		// print i array.
	    System.out.println();
	    for (int row[] : i) {
	    	for (int col : row) {
	    		System.out.print(col + " ");
	    	}
	    	System.out.println();
	    }
	   

	}

}
