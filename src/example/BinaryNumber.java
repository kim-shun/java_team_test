package example;

import java.util.Scanner;

public class BinaryNumber {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("整数を入力してください：");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		ChangeBinary(num);

	}
	
	static void ChangeBinary(int num) {
		String binary = "";
		while (num > 0) {
			binary = String.valueOf(num % 2) + binary;
			num /= 2;
		}
		System.out.println(binary);
			
			
			
		
	}

}
