package example;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {

	public TimeZoneTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		TimeZone tzn1 = TimeZone.getDefault();//[1]
        Calendar cal1 = Calendar.getInstance(tzn1);//[2]
        System.out.println("タイムゾーンID : " + tzn1.getID());//[3]
        System.out.println("タイムゾーン : " + tzn1.getDisplayName());//[4]
        System.out.println("日時　: " + cal1.get(Calendar.YEAR) + "/" 
                + (cal1.get(Calendar.MONTH) + 1) + "/"
                + cal1.get(Calendar.DAY_OF_MONTH) + "　"
                + cal1.get(Calendar.HOUR_OF_DAY) + ":" 
                + cal1.get(Calendar.MINUTE) + ":" 
                + cal1.get(Calendar.SECOND));//[5]
 
        TimeZone tzn2 = TimeZone.getTimeZone("US/Hawaii");
        cal1.setTimeZone(tzn2);//[6]
        System.out.println("タイムゾーンID : " + tzn2.getID());//[7]
        System.out.println("タイムゾーン : " + tzn2.getDisplayName());//[8]
        System.out.println("日時　: " + cal1.get(Calendar.YEAR) + "/" 
                + (cal1.get(Calendar.MONTH) + 1) + "/"
                + cal1.get(Calendar.DAY_OF_MONTH) + "　"
                + cal1.get(Calendar.HOUR_OF_DAY) + ":" 
                + cal1.get(Calendar.MINUTE) + ":" 
                + cal1.get(Calendar.SECOND));//[9]

	}

}
