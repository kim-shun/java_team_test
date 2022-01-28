package example;

public class BingoRe {

	public static void main(String[] args) {
		int[] B = new int[15];
		int[] I = new int[15];
		int[] N = new int[15];
		int[] G = new int[15];
		int[] O = new int[15];
		
		for (int i =0; i < 15; i++) {
			B[i] = i + 1;
			I[i] = i + 16;
			N[i] = i + 31;
			G[i] = i + 46;
			O[i] = i + 61;
			
			System.out.println(O[i]);
		}
		

	}

}
