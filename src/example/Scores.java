package example;

public class Scores {

	public static void main(String[] args) {
		int max = 0;
		int scores[] = {80, 92, 60, 100, 78};
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) max = scores[i];
		}
		
		System.out.println("最高得点は" + max + "です。");

	}

}
