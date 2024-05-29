import java.io.*;
public class Lab09_2{
	public static void main(String[] args) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try {
			fos = new FileOutputStream("test.txt");
			osw = new OutputStreamWriter(fos, "UTF-8");
			java.util.Scanner scan = new java.util.Scanner(System.in);
			String userInput = scan.nextLine();
			while(userInput.length() != 0) {
				osw.write(userInput);
				osw.write("\r\n", 0, 2);
				userInput = scan.nextLine();
				
			}
			scan.close();
			osw.close();
			fos.close();
			
			fis = new FileInputStream("test.txt");
			isr = new InputStreamReader(fis, "UTF-8");
			
			char[] chr = new char[10];
			
			isr.close();
			fis.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}