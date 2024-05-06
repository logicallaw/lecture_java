import java.io.*;
public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte[] b = new byte[] {7,5,1,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("/Users/jun/Desktop/java_leewook/test/test4.out");
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
		System.out.println("I/O success!");
	}
}
