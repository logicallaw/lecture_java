import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Lab09_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("test.txt");
			String userInput = scan.nextLine();
			while(userInput.length() != 0) {
				fw.write(userInput);
				fw.write("\r\n", 0, 2);
				userInput = scan.nextLine();
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scan.close();
		
		try {
			FileReader fr = new FileReader("test.txt");
			int c;
			while((c = fr.read()) != 0) {
				System.out.print((char)c);
			}
			fr.close();
		} catch(IOException e) {
			System.out.println("error!");
		}
	}

}
