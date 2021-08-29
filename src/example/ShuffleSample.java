package example;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleSample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < 9; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
