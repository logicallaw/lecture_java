//import java.io.*;
//
//public class Lab08_5 {
//	public static void main(String[] args) {
//		//1바이트씩 복사시 23초 걸림.
//		File src = new File("/Users/jun/Desktop/java_leewook/dlwlrma.jpg");
//		File dest = new File("/Users/jun/Desktop/java_leewook/dlwlrma_copy.jpg");
//		int index = 0;
//		long startTime = System.currentTimeMillis();
//		try{
//			FileInputStream fin = new FileInputStream(src);
//			FileOutputStream fout = new FileOutputStream(dest);
//			int c;
//			while((c = fin.read()) != -1) {
//				fout.write(c);
//			}
//			fout.close();
//			fin.close();
//		} catch(IOException e) {
//			System.out.println("I/O error!");
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("success: " + (endTime - startTime) + "ms");
//	}
//
//}
