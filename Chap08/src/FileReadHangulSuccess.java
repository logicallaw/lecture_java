import java.io.*;
//File-FIS-ISR
public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("/Users/jun/Desktop/java_leewook/test/test.txt");
			in = new InputStreamReader(fin, "UTF-8");
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류!");
		}
	}

}
