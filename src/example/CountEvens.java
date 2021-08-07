package example;

public class CountEvens {

	public static void main(String[] args) {
		int nums[] = {2,1,7,8,2,3,4};
		
		int count = 0;
		for (int num: nums) {
			if (num % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
