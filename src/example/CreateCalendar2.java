package example;

import java.util.Calendar;

public class CreateCalendar2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH);
		System.out.println(thisMonth);
		int thisYear = cal.get(Calendar.YEAR);
		System.out.println(thisYear);
		
		cal.add(thisMonth, 3);
		System.out.println(cal.get(thisMonth));
		
		
		

	}

}
