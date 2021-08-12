package example;

public class FizzBuzz {
	void fizzBuzz() {
		for (int count = 1; count <= 100; count++) {
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (count % 3 == 0) {
				System.out.println("Fizz");
			} else if (count % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(count);
			}
		}
	}
}
