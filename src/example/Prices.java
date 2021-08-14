package example;

public class Prices {

	public static void main(String[] args) {
		int prices1[][] = {
				{100, 150, 200},
				{130, 400, 700},
				{1000, 1200, 450}
		};
		System.out.println(prices1[0][1]);
//		実行結果:150
		System.out.println();
		
		for (int i = 0; i < prices1.length; i++) {
			System.out.print(prices1[0][i]);
			System.out.print(" ");
		}
//		実行結果:100 150 200 
		
		System.out.println("\n");
		
		int prices2[][][] = {{{100, 180, 600}},{{300, 800, 450, 700, 900, 1000}},{{400, 560, 900}}};
		
		System.out.println(prices2[0][0][1]);
//		実行結果:180
		System.out.println(prices1.length);
		System.out.println(prices2.length);
//		実行結果:3
		
		System.out.println();
		
		System.out.println(prices2[0][0][0]);
//		実行結果:100
		System.out.println(prices2[2][0][2]);
//		実行結果:900
		
		System.out.println();
		
		for (int i = 0; i < prices2.length; i++) {
			for (int j = 0; j < prices2[i][0].length; j++) {
				System.out.print(prices2[i][0][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		

	}

}
