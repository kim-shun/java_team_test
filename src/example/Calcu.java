package example;

public class Calcu {

	public static void main(String[] args) {
		twice(5);
		twice(65);
		twice(3247);
		powerOfTwo(3);
		powerOfTwo(10);

	}
	
	public static void twice(int n) {
		System.out.println(n + "の2倍は、");
		System.out.println(n * 2);
	}
	
	public static void powerOfTwo(int n) {
		int answer = 1;
		
		for(int i = 0; i < n; i++) {
			answer = answer * 2;
		}
		
		System.out.print("2の" + n + "乗は、");
        System.out.println(answer);
	}

}
