import java.io.*;
import java.util.Scanner;
public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("/Users/jun/Desktop/java_leewook/test/test3.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			System.out.println();
//			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
	}

}
