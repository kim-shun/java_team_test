package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBatch {

	public static void main(String[] args) {
		dateFormatInput("19/12/06 09:23:00");
		dateFormatInput("2022/02/02 13:45:00");
		dateFormatInput("2018/12/2 14:56:00");
		dateFormatInput("16/1/2 14:57:00");
		dateFormatInput("2015/8/2 14:58:00");
		dateFormatInput("2010/8/22 14:59:00");
		dateFormatInput("2020/03/09 14:56:00.000008");
		dateFormatInput("2014/1/7 14:56:00.000008");
	}
//	formatStr 
//	ミリ秒以下はString
	private static String dateFormatChange(Date dateTime, String m, String formatStr) {
		String strRstDate = "";
		SimpleDateFormat sdFormat = new SimpleDateFormat(formatStr);
		strRstDate = sdFormat.format(dateTime);
		
		if (m.equals(null)) {
			strRstDate = strRstDate + "000000";
		} else {
			strRstDate = strRstDate + m;
		}
		return strRstDate;
	}
	
	public static void dateFormatInput(String date) {
		
		String dateFormat1 = "yy/MM/dd HH:mm:ss";
		String dateFormat2 = "yyyy/MM/dd HH:mm:ss";
		String dateFormat3 = "yyyy/MM/dd HH:mm:ss.SSSSSS";
		
		String dateFormat = "";
		String mills = "";
		
		if (date.length() <= 19) {
			if (date.substring(2,3).equals("/")) {
				dateFormat = dateFormat1;
			} else {
				dateFormat = dateFormat2;
			}
		} else if (date.length() <= 26) {
			dateFormat = dateFormat3;
			mills = date.substring(date.length() - 6, date.length());
			date = date.substring(0,date.length() - 7);
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date d = null;
		try {
			d = sdf.parse(date);
			
			if (mills.equals(null)) {
				Integer.parseInt(mills);
			}
		} catch (Exception e){
			System.out.println("エラー");
		}
		
		
		date = dateFormatChange(d,mills,"yyyyMMddHHmmss");
		System.out.println(date);

        
	}

}
