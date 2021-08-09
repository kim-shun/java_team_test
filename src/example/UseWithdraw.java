package example;

import java.util.Scanner;

public class UseWithdraw {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int balance = 100000;
		
		System.out.println("いくら引き落としますか?（手数料110円かかります）");
		int amount = scan.nextInt();
		
		Bank withdraw1 = new Bank();
		withdraw1.Withdraw(balance, amount);
	}

}
