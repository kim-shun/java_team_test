package example;

import java.util.Scanner;

public class UseNearTen2 {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("二桁の整数を入力してください");
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		UseNearTen2 num1 = new UseNearTen2();
		num1.NearTen2(num);
	}
	
	public void NearTen2(int num) {
		int quotient = num % 10;
		if (quotient <= 2 || quotient >= 8) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
