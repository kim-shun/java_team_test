package example;

import java.util.ArrayList;
import java.util.Collections;

public class Bingo {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		int num = 1;
		for (int count = 1; count <= 5; count++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = num; i <= num + 14; i++) {
				list.add(i);
			}
			Collections.shuffle(list);
			lists.add(list);
			num += 15;
		}
		
		System.out.println("  B |  I |  N |  G |  O");
		
		for (int count = 0; count <= 4; count++) {
			for (int i = 0; i <= 4; i++) {
				if (count == 2 && i == 2) {
					System.out.print("    |");
				} else {
					System.out.printf("%3d", lists.get(i).get(count));
					if (i != 4) {
						System.out.print(" |");
					}
				}
			}
			System.out.println("\n");

	    }

	}

}
