
public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('C'));
		char c1 = '4';
		char c2 = 'F';
		if (Character.isDigit(c1)) { //해당 문자가 숫자라면 true;
			System.out.println("Digit");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println("Alphabet");
		}
		
	}

}
