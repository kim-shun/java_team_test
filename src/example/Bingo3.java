package example;

import java.util.ArrayList;
import java.util.Collections;

public class Bingo3 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = num; j <= num + 14; j++) {
				list.add(j);
			}
			Collections.shuffle(list);
			lists.add(list);
			num += 15;
		}
		
		System.out.println("  B |  I |  N |  G |  O");
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 2 && j == 2) {
					System.out.print("    |");
				} else {
					System.out.printf("%3d", lists.get(j).get(i));
					if (j != 4) {
						System.out.print(" |");
					}
				}
			}
			System.out.println();

	    }

	}

}
