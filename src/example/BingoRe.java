package example;

import java.util.ArrayList;
import java.util.Collections;

public class BingoRe {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		int num = 1;
		for (int i = 0; i < 5; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = num; j < num+15; j++) {
				list.add(j);
			}
			Collections.shuffle(list);
			lists.add(list);
			num += 15;
		}
		
        System.out.println("  B |  I |  N |  G |  O");
		
		for (int k = 0; k < 5; k++) {
			System.out.printf("%3d%s",lists.get(0).get(k)," |");
			System.out.printf("%3d%s",lists.get(1).get(k)," |");
			if (k == 2) {
				System.out.printf("%5s","|");
			} else {
				System.out.printf("%3d%s",lists.get(2).get(k)," |");
			}
			System.out.printf("%3d%s",lists.get(3).get(k)," |");
			System.out.printf("%3d",lists.get(4).get(k));
			System.out.println();
		}
		
	
	}

}
