package example;

import java.util.ArrayList;
import java.util.Collections;

public class Bingo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list15 = new ArrayList<Integer>();
		ArrayList<Integer> list30 = new ArrayList<Integer>();
		ArrayList<Integer> list45 = new ArrayList<Integer>();
		ArrayList<Integer> list60 = new ArrayList<Integer>();
		ArrayList<Integer> list75 = new ArrayList<Integer>();
		
		for(int count = 1 ; count <= 15 ; count++) {
            list15.add(count);
        }
		
		for(int count = 16 ; count <= 30 ; count++) {
            list30.add(count);
        }
		
		for(int count = 31 ; count <= 45 ; count++) {
            list45.add(count);
        }
		
		for(int count = 46 ; count <= 60 ; count++) {
            list60.add(count);
        }
		
		for(int count = 61 ; count <= 75 ; count++) {
            list75.add(count);
        }
		
		Collections.shuffle(list15);
		Collections.shuffle(list30);
		Collections.shuffle(list45);
		Collections.shuffle(list60);
		Collections.shuffle(list75);
		
		System.out.println("  B |  I |  N |  G |  O");
		
		for (int count = 0; count <= 4; count++) {
			System.out.printf("%3d", list15.get(count));
			System.out.print(" |");
			System.out.printf("%3d", list30.get(count));
			System.out.print(" |");
			
			if (count == 2) {
				System.out.print("    |");
			} else {
				System.out.printf("%3d", list45.get(count));
				System.out.print(" |");
			}
			
			System.out.printf("%3d", list60.get(count));
			System.out.print(" |");
			System.out.printf("%3d", list75.get(count));
			System.out.println("\n");
		}


	}

}
