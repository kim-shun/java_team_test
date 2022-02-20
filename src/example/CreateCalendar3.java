package example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class CreateCalendar3 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		String[] month = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		String[] week = {"","Su","Mo","Tu","We","Th","Fr","Sa"};
		
		int lastDay = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
		ArrayList<Integer> dates = new ArrayList<Integer>();
		for (int i = 1; i <= lastDay; i++) {
			dates.add(i);
		}
		
		int thisYear = cl.get(Calendar.YEAR);
		int thisMonth = cl.get(Calendar.MONTH);
		cl.set(thisYear,thisMonth,1);
		int firstDayWeek = cl.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(month[thisMonth]);
		System.out.println(thisYear);   

		for (int i = 1; i < week.length; i++) {
			System.out.printf("%2s ",week[i]);
		}
		System.out.println();
		
		System.out.print(String.join("", Collections.nCopies(firstDayWeek, " ")));
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%2d ",dates.get(i));

			if ((firstDayWeek + i - 1) % 7 == 0) {
				System.out.println();
			}
		}


	}

}
