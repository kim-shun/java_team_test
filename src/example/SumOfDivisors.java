package example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDivisors {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		

	}

}
