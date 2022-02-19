package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	


	public static void main(String[] args) {
		
		dateFormatInput("19/12/06 09:23:00");
		dateFormatInput("2022/02/02 13:45:00");
		dateFormatInput("2020/03/09 14:56:00.000008");
		dateFormatInput("2014/1/7 14:56:00.000008");
		dateFormatInput("2018/12/2 14:56:00");
		dateFormatInput("16/1/2 14:57:00");
		dateFormatInput("2015/8/2 14:58:00");
		dateFormatInput("2010/8/22 14:59:00");
		
	}
	
	private static String dateFormatChange(Date dateTime, String formatStr) {
		String strRstDate = "";
		SimpleDateFormat sdFormat = new SimpleDateFormat(formatStr);
		strRstDate = sdFormat.format(dateTime);
		
		return strRstDate;
	}
	
	public static void dateFormatInput(String strDate) {
		
		System.out.println(strDate);
		
		System.out.println("date型に変換するよ");

		String dateFormat1 = "yy/MM/dd HH:mm:ss";
		String dateFormat2 = "yyyy/MM/dd HH:mm:ss";
		String dateFormat3 = "yyyy/MM/dd HH:mm:ss.SSSSSS";
		
		String dateFormat = "";
		if (strDate.length() <= 19) {
			if (strDate.substring(2,3).equals("/")) {
				dateFormat = dateFormat1;
			} else {
				dateFormat = dateFormat2;
			}
		} else if (strDate.length() <= 26) {
			dateFormat = dateFormat3;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date;
		date = null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(date);
		
		String date2 = "";
		date2 = dateFormatChange(date,"yyyyMMddHHmmss");
		System.out.println("羅列させるよ");
		System.out.println(date2);
		
		System.out.println();
		

	}

}
