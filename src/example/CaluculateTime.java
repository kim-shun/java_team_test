package example;

import java.util.Scanner;

public class CaluculateTime {
	

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("秒を入力してください");
		 sc = new Scanner(System.in);
		double seconds1 = sc.nextDouble();
		caluculateSeconds(seconds1);
	}
	
	public static void caluculateSeconds(double seconds) {
		double minutes = seconds / 60;
		double hour = minutes / 60;
		double day = hour / 24;
		System.out.println(seconds + "秒は" + minutes + "分です");
		System.out.println(seconds + "秒は" + hour + "時間です");
		System.out.println(seconds + "秒は" + day + "日です");
	}

}
