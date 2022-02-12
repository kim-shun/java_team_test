package example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDivisors {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scan.nextInt();
		System.out.println("約数の和を出す範囲を指定してください");
		int range = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list.add(i);
				sum += i;
			}
		}
		
		int sum2 = 0;
		for (int j = 1; j <= range; j++) {
			if (num % j == 0) {
				sum2 += j;
			}
		}
		System.out.println("約数の数は" + list.size() + "です");
		System.out.println("約数の総和は" + sum + "です");
		System.out.println(range +"以下の約数の和は" + sum2 + "です");
		
		

	}

}
