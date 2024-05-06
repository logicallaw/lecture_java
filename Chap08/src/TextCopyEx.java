import java.io.*;
public class TextCopyEx {
	public static void main(String[] args) {
		//문자 스트림 이용
		File src = new File("/Users/jun/Desktop/java_leewook/test/test2.txt");
		File dest = new File("/Users/jun/Desktop/java_leewook/test/test5.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fw.close();
			fr.close();
			System.out.println("Copy success!");
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
	}

}
