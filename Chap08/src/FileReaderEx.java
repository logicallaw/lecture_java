import java.io.*;
public class FileReaderEx {
	public static void main(String[] args) {
		//File-FIR
		FileReader fin = null;
		try {
			fin = new FileReader("/Users/jun/Desktop/java_leewook/test/test.txt");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류!");
		}
	}

}
