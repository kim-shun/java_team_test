package example;

public class CountEvens {

	public static void main(String[] args) {
		int[] nums = new int[7];
		
		int count = 0;
		for (int num: nums) {
			num = (int) Math.ceil(Math.random()*99);
			System.out.println(num);
			if (num % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("偶数は" + count + "つあります。");
	}

}

