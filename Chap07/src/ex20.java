import java.util.Calendar;
public class ex20 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.clear();
		now.set(2022 ,11, 30);
		int YEAR = now.get(Calendar.YEAR);
		System.out.println(YEAR);
		System.out.println(now.get(Calendar.MONTH));
	}

}
