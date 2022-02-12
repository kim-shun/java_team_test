package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoRe {

	public static void main(String[] args) {
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> I = new ArrayList<Integer>();
		List<Integer> N = new ArrayList<Integer>();
		List<Integer> G = new ArrayList<Integer>();
		List<Integer> O = new ArrayList<Integer>();
		
		
		for (int i =0; i < 15; i++) {
			B.add(i + 1);
			I.add(i + 16);
			N.add(i + 31);
			G.add(i + 46);
			O.add(i + 61);
			
		}
		
		Collections.shuffle(B);
		Collections.shuffle(I);
		Collections.shuffle(N);
		Collections.shuffle(G);
		Collections.shuffle(O);
		
		System.out.println("  B |  I |  N |  G |  O");
		
		for (int j= 0; j < 5; j++) {
			System.out.print(B.get(j));
			System.out.print(I.get(j));
			System.out.print(N.get(j));
			System.out.print(G.get(j));
			System.out.print(O.get(j));
			System.out.println();
		}
		
	}

}
