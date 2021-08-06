package example;

public class JavaGouse {

	public static void main(String[] args) {
//		int count = 1;
//		int sum = 0;
//		
//		while (count <= 40) {
//			sum += Math.pow(count, 4);
//			count += 1;
//		}
//		System.out.println(sum);
		
		int sum = 0;
		for (int count = 0; count <= 40; ++count) {
			sum += Math.pow(count, 4);
		}
		System.out.println(sum);
	}

}
