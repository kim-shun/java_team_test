package example;

import java.util.Arrays;

public class CounEvens2 {

	public static void main(String[] args) {
		int[] nums1 = {2, 1, 7, 8, 2, 3, 4};
        int[] nums2 = {2, 2, 6, 5, 0};
        int[] nums3 = {1, 3, 11, 5};
        
        countEvens(nums1);
        countEvens(nums2);
        countEvens(nums3);

	}

    static void countEvens(int[] nums) {
		long count = Arrays.stream(nums).filter(num -> num % 2 == 0).count();
		System.out.println(count);
	}
}
