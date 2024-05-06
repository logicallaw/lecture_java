import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte[] b = new byte[7];
		try {
			FileInputStream fin = new FileInputStream("/Users/jun/Desktop/java_leewook/test/test4.out");
			int n = 0;
			int c;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
		for (byte element : b)
			System.out.print(element + " ");
		
	}

}
