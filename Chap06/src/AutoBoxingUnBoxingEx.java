
public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		int	n = 10;
		Integer intObject = n; //자동 박싱:내부적으로 Integer.valueOf(n);이 실행된다.
		System.out.println("intObject = " + intObject);
		//intObject는 클래스지만 내부적으로 자동언박싱해서 문자열로 출력되면 숫자를 리턴한다.
		int m = intObject + 10; //자동 언박싱된다:내부적으로 intObject.intValue();로 자동 처리된다.
		System.out.println(m);
	}

}
