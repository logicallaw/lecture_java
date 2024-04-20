import java.util.Scanner;

public class Lab03_2 {
	public static void main(String[] args) {
		// declare scanner.
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input 5 positive numbers: ");
		int[] intArray = new int[5];
		int sum = 0;
		int counter = 0;

		// 배열 객체의 length를 사용하여 조건을 설정한다.
		for (; counter < intArray.length; counter++) {
			intArray[counter] = scanner.nextInt();
			sum += intArray[counter];
		}

		// 꼭 double타입으로 캐스팅해야한다!
		System.out.println("Average: " + (double) sum / counter);

	}

}
