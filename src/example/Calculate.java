package example;

public class Calculate {
	
	void calculatePoints(int amount, boolean isBirthday) {
		double point;
		
		if (amount <= 999) {
			point = amount * 0.03;
		} else {
			point = amount * 0.05;
		}
		
		if (isBirthday) {
			point *= 5;
		}
		System.out.println("ポイントは" + (int) point + "点です");
	}

}
