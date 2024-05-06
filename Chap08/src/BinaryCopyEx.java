import java.io.*;
public class BinaryCopyEx {
	public static void main(String[] args) {
		//바이트 스트림 이용
		File src = new File("/Users/jun/Desktop/java_leewook/tmp/dlwlrma.jpg");
		File dest = new File("/Users/jun/Desktop/java_leewook/tmp/dlwlrma_copy.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fo.close();
			fi.close();
			
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사했습니다.");
		} catch(IOException e) {
			System.out.println("Copy error!");
		}
	}

}
