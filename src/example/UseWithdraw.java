package example;

import java.util.Scanner;

public class UseWithdraw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance = 100000;
		int amount = scan.nextInt();
		
		System.out.println("いくら引き落としますか?（手数料110円かかります）");
		
		Bank withdraw1 = new Bank();
		withdraw1.Withdraw(balance, amount);
	}

}
