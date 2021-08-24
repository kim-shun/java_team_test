package example;

import java.util.Scanner;

public class EmployeeChart {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("社員の数を入力してください");
		int num = sc.nextInt();
		System.out.println("社員の名前と年齢を入力してください");
		for (int i = 0; i < num; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			System.out.println(name + " " + (age + 1));
		}

	}

}
