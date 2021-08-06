package example;

public class JavaGouse {

	public static void main(String[] args) {
		int count = 1;
		int sum = 1;
		
		while (count <= 40) {
			sum += Math.pow(count, 4);
			count += 1;
		}
		System.out.println(sum);
		
		

	}

}
