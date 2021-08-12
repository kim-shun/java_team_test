package example;

import java.util.Scanner;

public class UseNearTen {

	public static void main(String[] args) {
		System.out.println("3桁の正の整数を入力してください");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		NearTen num1 = new NearTen();
		num1.nearTen(input);
		
//		NearTen num2 = new NearTen();
//		num2.nearTen(123);
//		
//		NearTen num3 = new NearTen();
//		num3.nearTen(111);
//		
//		NearTen num4 = new NearTen();
//		num4.nearTen(98);
//		
//		NearTen num5 = new NearTen();
//		num5.nearTen(124);
//		
//		NearTen num6 = new NearTen();
//		num6.nearTen(400);
//		
//		NearTen num7 = new NearTen();
//		num7.nearTen(45);

	}

}
