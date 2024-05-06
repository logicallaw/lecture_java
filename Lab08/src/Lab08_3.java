import java.io.*;

public class Lab08_3{
	public static void readTexts(File f) {
		FileInputStream in = null;
		InputStreamReader fin = null;
		BufferedReader br = null;
		try{
			in = new FileInputStream(f);
			fin = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(fin, 100);
//			int c;
//			while((c = br.read()) != -1) {
//				System.out.print((char)c);
//			}
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fin.close();
			in.close();
			
		} catch(IOException e) {
			System.out.println("read error!");
		}
//		System.out.println();
	}
	public static void main(String[] args) {
		File dir = new File("/Users/jun/Desktop/java_leewook/tmp");
		String res = "";
		if (dir.isFile()) res = "file";
		else if (dir.isDirectory()) res = "directory";
		
		File[] subFiles = dir.listFiles();
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			//파일명 출력
			if (f.isFile() && !(f.getName()).equals(".DS_Store")) {
				System.out.println("<" + f.getName() + ">");
				readTexts(f);
				System.out.println();
			}
			//내용 출력
//			if (f.isFile()) readTexts(f);
//			System.out.println();
		}
	}
}