package example;

import java.util.Calendar;
import java.util.Collections;

public class CreateCalendar3 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
	
		String[] month = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		String[] week = {"Su","Mo","Tu","We","Th","Fr","Sa"};
		
		int thisYear = cl.get(Calendar.YEAR); //今年
		int thisMonth = cl.get(Calendar.MONTH); //今月(1月=0、2月=1であるため配列monthの添字に使用)
		int firstDay = 1; //今月の初日
		//今月の初日の曜日(日曜日=1、月曜日=2であるため-1をして配列weekの添字に使用)
		cl.set(thisYear,thisMonth,firstDay);
		int firstDayWeek = cl.get(Calendar.DAY_OF_WEEK) - 1; 
		int lastDay = cl.getActualMaximum(Calendar.DAY_OF_MONTH); //今月の最終日
		
		System.out.print(month[thisMonth]);
		System.out.println(thisYear);   

		//カレンダーの曜日を表示
		for (int i = 0; i < week.length; i++) {
			System.out.printf("%2s ",week[i]);
		}
		System.out.println();
		//初日の位置を曜日に合わせる
		System.out.print(String.join("", Collections.nCopies(firstDayWeek, "   ")));
		//日付を表示させる
		for (int i = firstDay; i <= lastDay; i++) {
			System.out.printf("%2d ",i);
			if ((firstDayWeek + i) % 7 == 0) {
				System.out.println();
			}			
		}
	}
}
