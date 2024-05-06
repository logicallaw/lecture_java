import java.io.*;
import java.util.*;
public class Lab08_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OutputStreamWriter iout = null;
		FileOutputStream fin = null;
		try {
			fin = new FileOutputStream("c:\\test\\test3.txt");
			iout = new OutputStreamWriter(fin, "UTF-8");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0) {
					break;
				}
				iout.write(line, 0, line.length());
				iout.write("\r\n", 0, 2);
			}
			
			iout.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("error");
		}
		InputStreamReader ist = null;
		FileInputStream fst = null;
		try {
			fst = new FileInputStream("c:\\test\\test3.txt");
			ist = new InputStreamReader(fst, "UTF-8");
			int c;
			while((c = ist.read()) != -1) {
				System.out.print((char)c);
			}
			ist.close();
			fst.close();
		} catch(IOException e) {
			System.out.println("error2");
		}
		
		scan.close();
	}

}
