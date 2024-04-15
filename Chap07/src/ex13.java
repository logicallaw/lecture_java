import java.util.Scanner;
public class ex13 {
	static Scanner scan = new Scanner(System.in);
	public static void closeScanner() {
		scan.close();
	}
	public static int[][] makeArray(){
		int[][] temp = new int[3][];
		temp[0] = new int[3];
		temp[1] = new int[1];
		temp[2] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = scan.nextInt();
			}
		}
		
		return temp;
		
	}
	public static void main(String[] args) {
		int[][] i = makeArray();
		for (int[] row : i) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		closeScanner();
	}

}
