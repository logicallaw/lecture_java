import java.util.Scanner;
public class Lab03_5 {
	
	public static int[][] makeArray(Scanner scanner) {
		System.out.println("Enter 8 integers");
		
		int i[][] = new int[3][];
		i[0] = new int[3];
		i[1] = new int[1];
		i[2] = new int[4];
		
		for (int j = 0; j < i.length; j++) {
			for (int k = 0; k < i[j].length; k++) {
				i[j][k] = scanner.nextInt();
			}
		}
		return i;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] i = makeArray(scanner);
	
		System.out.println();
		for (int row[] : i) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}


}
}