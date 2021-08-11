package example;

public class Multidimensional {

	public static void main(String[] args) {
		int totals[] = new int[5];
		
		int scores[][] = {{80, 92, 60, 100, 78},
				          {60, 45, 65, 56, 80},
		                  {64, 89, 48, 45, 67}};
		for (int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				totals[j] += scores[i][j];
			}
		}
		
		for(int i = 0; i < totals.length; i++) {
			System.out.println(i + "さんの合計得点は" + totals[i] + "点です。");
		}

	}

}
