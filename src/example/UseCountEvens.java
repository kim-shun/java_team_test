package example;

public class UseCountEvens {
	public static void main(String[] args) {
		CountNums n = new CountNums();
		int[] nums1 = {2, 1, 7, 8, 2, 3, 4};
		int[] nums2 = {2, 2, 6, 5, 0};
		int[] nums3 = {1, 3, 11, 5};
		
		n.countEvens(nums1);
		n.countEvens(nums2);
		n.countEvens(nums3);
	}

}
