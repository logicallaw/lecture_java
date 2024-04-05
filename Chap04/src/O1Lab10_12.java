import java.util.Scanner;

class Student{
	private int[] scores;
	private int counter;
	
	public Student() {}
	public Student(int size) {
		scores = new int[size];
		counter = 0;
	}
	
	public void setScore(int score) {
		scores[counter++] = score;
	}
	
	public int sumScores() {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	public int getCounter() {
		return scores.length;
	}
	
}



public class O1Lab10_12 {
	static public Scanner scan = new Scanner(System.in);
	static public void closeScanner() {
		scan.close();
	}
	static public double getOverallAverage(Student[] students) {
		int sum = 0;
		int counter = 0;
		
		for (int i = 0; i < students.length; i++) {
			sum += students[i].sumScores();
			counter += students[i].getCounter();
		}
		
		return (double)sum/ counter;
	}
	public static void main(String[] args) {
		int size;
		System.out.print("학생 수를 입력해 주세요: ");
		size = scan.nextInt();
		
		Student[] students = new Student[size];
		
		System.out.println();
		for (int i = 1; i <= size; i++) {
			System.out.print("학생 " + i + "의 성적 수를 입력하세요: ");
			int temp = scan.nextInt();
			students[i - 1] = new Student(temp);
			for (int j = 1; j <= temp; j++) {
				System.out.print("성적 " + j + "를 입력하세요: ");
				int score = scan.nextInt();
				students[i - 1].setScore(score);
			}
			System.out.println();
		}
		
		System.out.println("전체 학생들의 평균: " + getOverallAverage(students));
		
		O1Lab10_12.closeScanner();
		
	}

}
