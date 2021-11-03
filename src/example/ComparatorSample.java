package example;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSample {

	public static void main(String[] args) {
		int[][] multi = new int [][] {
			{4, 9, 8},
            {7, 5, 2},
            {3, 0, 6},
		};
		
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++)
				System.out.println(multi[i][j] + "");
			    System.out.println();
			
		}

	}
	
	public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] > second[columnNumber-1]) return 1;
               else return -1;
            }
        });
    }
	

}
