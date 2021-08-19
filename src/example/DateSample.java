package example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		Date date = new Date();
		String today = date.toString();
		System.out.println(today);
		
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(cl.getTime()));

	}

}
