import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class Lab08_4 {
	public static void main(String[] args) {
//		File src = new File("/Users/jun/Desktop/java_leewook/tmp/dlwlrma.jpg");
//		FileInputStream fin = null;
//		int c;
//		long time = System.currentTimeMillis();
//		try {
//			fin = new FileInputStream(src);
//			while((c = fin.read()) != -1) {
//			}
//			fin.close();
//		} catch(IOException e) {
//			System.out.println("read error!");
//		}
//		System.out.println(time + "ms");
//	}
		FileReader fin = null;
		int c;
		long time = System.currentTimeMillis();
		try {
			BufferedOutputStream bout = new BufferedOutputStream(System.out,2000000000);
			fin = new FileReader("/Users/jun/Desktop/java_leewook/tmp/dlwlrma.jpg");
			while((c = fin.read()) != -1) {
				bout.write((byte)c);
			}
			fin.close();
			bout.close();
		} catch(IOException e) {
			System.out.println("read error!");
		}
		System.out.println(time + "ms");
	}
}