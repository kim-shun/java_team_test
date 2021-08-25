package example;

public class UseNum2 {

	public static void main(String[] args) {
		UseNum2 n1 = new UseNum2();
		n1.Num2(1, 5, 3);
		n1.Num2(1, 5, 5);
		n1.Num2(1, 9, -2);

	}
	

	void Num2(int a, int b, int c) {
		int ab = a + b;
		if (c <= 3) {
			System.out.println(ab / c);
		} else {
			System.out.println(ab * c);
		}
	}

}

