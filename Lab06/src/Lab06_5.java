import java.lang.StringBuffer;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.Math;
public class Lab06_5 {
	static Scanner scan = new Scanner(System.in);
	public static void closeScanner() { scan.close();}
	
	public static void main(String[] args) {
		System.out.print("Input a string: "); //ex: Bart, don’t make fun of grad students. They just made a terrible life choice…
		String temp = scan.nextLine();
		StringBuffer sb = new StringBuffer(temp);
		
		//length of sb 
		int length = sb.length();
		
		//random startIndex/
		int startIndex = (int)(Math.random()*length); //0~length-1
		sb.replace(0, startIndex + 1 , "");
		
		StringTokenizer st = new StringTokenizer(sb.toString()," ");
		int words = st.countTokens();
		
		System.out.println("startIndex = " + startIndex + ", #words = " + words);
		System.out.println(sb.toString());//sb.toString()
		
		Lab06_5.closeScanner();
	}

}
