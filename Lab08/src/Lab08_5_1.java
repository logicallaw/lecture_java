import java.io.*;
public class Lab08_5_1 {
	public static void main(String[] args) {
		File src = new File("/Users/jun/Desktop/java_leewook/dlwlrma.jpg");
		File dest = new File("/Users/jun/Desktop/java_leewook/dlwlrma_copy.jpg");
		int index = 0;
		int c;
		byte[] b = new byte[1024*64];
		long startOfTime = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			while(true) {
				int num = fin.read(b); //해당 바이트 배열의 크기만큼 파일에서 읽어서 실제로 읽은 바이트 수를 리턴한다.
				fout.write(b, 0, num); //실제로 읽은 만큼 파일에 저장한다.
				if(num < b.length) { //파일에 끝에 도달하여 바이트 배열의 크기만큼 읽지 못하였다면 break로 탈출한다.
					break;
				}
			}
			fout.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("I/O error!");
		}
		long endOfTime = System.currentTimeMillis();
		System.out.println("success: " + (endOfTime - startOfTime) + "ms");
	}

}
