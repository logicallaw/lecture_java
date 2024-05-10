import java.io.*;
public class Lab08_4{
	public static void main(String[] args) {
		File src = new File("/Users/jun/Desktop/java_leewook/dlwlrma.jpg");
		FileInputStream fis = null;
		long start = System.currentTimeMillis();
		try {
			fis = new FileInputStream(src);
			int c;
			while((c = fis.read()) != -1) {}
			fis.close();
		} catch(IOException e) {
			System.out.println("FileInputStream error!");
		}
		long end = System.currentTimeMillis();
		System.out.println("FileInputStream: "+ (end - start) + "ms");
		
		BufferedInputStream bis = null;
		start = System.currentTimeMillis();
		try {
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);
			while(bis.read() != -1) {}
			bis.close();
			fis.close();
		} catch(IOException e) {
			System.out.println("BufferedInputStream error!");
		}
		end = System.currentTimeMillis();
		System.out.println("BufferedInputStream: " + (end - start) + "ms");
	}
}