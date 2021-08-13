package example;

public class GetDays {
	void getDays(int year, int month) {
		int days;
		
		int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2) {
			if (year % 4 == 0) {
				if (year % 100 == 0 && year % 400 != 0) {
					days = 28;
				} else {
					days = 29;
				}
			} else {
				days = 28;
			}
		} else {
			days = month_days[month - 1];
		}
		System.out.println(year + "年" + month + "月は" + days + "日間あります");
	}

}
