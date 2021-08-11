package example;


public class Reciprocal {

	public static void main(String[] args) {
		double sum = 0;
		double count = 0;
		while (sum < 7) {
			count++;
			double reciprocal = 1 / count;
			sum += reciprocal;
		}
		System.out.println((int)count);
		System.out.println(sum);
		

	}

}
