package example;

import java.util.Scanner;

public class Hexa {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		ChangeHexa(num);

	}
	
	static void ChangeHexa(int num) {
		String[] hexa_all = {"0","1","2","3","4","5",
				"6","7","8","9","A","B","C","D","E","F"};
		String hexa = "";
		while (num > 0) {
			hexa = hexa_all[num % 16] + hexa;
			num /= 16;
		}
		System.out.println(hexa);
	}

}
