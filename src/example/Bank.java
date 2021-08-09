package example;

public class Bank {
	void Withdrraw(int balance, int amount) {
		int fee = 110;
		if (balance >= (amount + fee)) {
			balance -= (amount + fee);
			System.out.println(amount + "円引き落としました。残高は" + balance + "円です");
		} else {
			System.out.println("残高不足です");
		}
	}

}
