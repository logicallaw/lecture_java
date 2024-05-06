import java.io.*;
import java.util.Scanner;
public class Lab08_1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		FileReader fin = null;
		try {
			///Users/jun/Desktop/java_leewook/test/test.txt
			fout = new FileWriter("/Users/jun/Desktop/java_leewook/test/test3.txt");
			while(true) {
				String line = scan.nextLine();
				if (line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("I/O error!");
		}
		scan.close();
		
		try {
			fin = new FileReader("/Users/jun/Desktop/java_leewook/test/test3.txt");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
	}
}