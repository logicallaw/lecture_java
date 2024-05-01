import java.util.*;
import java.io.*;
public class Lab08_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\test\\test2.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("error");
		}
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\test\\test2.txt");
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("error");
		} 
		scan.close();
	}

}
