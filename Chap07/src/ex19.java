import java.util.Calendar;
public class ex19 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		
		System.out.println(year + " " + month);
	}

}
