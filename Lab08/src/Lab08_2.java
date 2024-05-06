import java.io.*;
import java.util.Scanner;
public class Lab08_2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OutputStreamWriter fout = null;
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("/Users/jun/Desktop/java_leewook/test/test3.txt");
			fout = new OutputStreamWriter(out, "UTF-8");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			out.close();
		}
		catch(IOException e) {
			System.out.println("I/O error!");
		}
		scan.close();
		
		InputStreamReader fin = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream("/Users/jun/Desktop/java_leewook/test/test3.txt");
			fin = new InputStreamReader(in, "UTF-8");
			int num;
			char[] c = new char[10];
			while((num = fin.read(c)) != -1) {
				for (int i = 0; i < num; i++) {
					System.out.print(c[i]);
				}
			}
			fin.close();
			in.close();
		} catch(IOException e) {
			
		}
//		try {
//			in = new FileInputStream("/Users/jun/Desktop/java_leewook/test/test3.txt");
//			fin = new InputStreamReader(in, "UTF-8");
//			int c;
//			char[] str = new char[10];
//			fin.read(str);
//			System.out.print(str);
//			
//			fin.close();
//			in.close();
//		} catch(IOException e) {
//			System.out.print("I/O error!");
//		}
	}
}