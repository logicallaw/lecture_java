import java.util.Scanner;

public class Lab03_1 {

	public static int getMax(int[] nums) {
		// find maximum through for-loop.
		int max = nums[0];
		for (int i = 1; i < 5; i++) {
			max = (max <= nums[i]) ? nums[i] : max;
		}
		return max;
	}

	public static void main(String[] args) {
		// declare scanner.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 5 positive numbers.");
		int[] nums = new int[5];

		// input 5 positive number.
		for (int i = 0; i < 5; i++) {
			nums[i] = scanner.nextInt();
		}

		// find maximum number by using getMax function.
		System.out.println("Maximun number: " + getMax(nums));
	}

}
