package example;

public class CountNums {
	void countEvens(int[] nums) {
		int count = 0;	
		for(int num : nums) {
			if (num % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
