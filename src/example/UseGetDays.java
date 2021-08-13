package example;

import java.util.Scanner;

public class UseGetDays {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("西暦を入力してください");
		scan = new Scanner(System.in);
		int year = scan.nextInt();
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		
		GetDays days = new GetDays();
		days.getDays(year, month);

	}

}
