package example;

public class NearTen {
	void nearTen(int num) {
		int total = num / 100 + num / 10 % 10 + num % 10;
		int remainder = total % 10;
		
		if (remainder <= 2 || remainder >= 8) {
			System.out.println("True");
		} else if (remainder <= 5) {
			System.out.println("10の倍数との差は" + remainder + "です");
		} else {
			System.out.println("10の倍数との差は" + (10 - remainder) + "です");
		}
	}

}
