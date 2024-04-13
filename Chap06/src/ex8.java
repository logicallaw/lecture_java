public class ex8 {
	public static void main(String[] args) {
		final int number = 10;
		int n = 10;
		switch(number + 5) { //15
		case number * 5: //2
			break;
		case number / 2: //5
			break;
		case number - 10:
			break;
		case n + 20: //n이 상수이면 정수 덧셈 가능.
			System.out.println(4 + "case");
			break;
		}
	}

}
