package example;

public class ChangeString {

	public static void main(String[] args) {
		int num1 = 0010;
		int num2 = 100;
		String num3 = "0010";
		int num4 = 01011;
		int num5 = 1011;
		int num6 = 01;
		int num7 = 00001;
		
		System.out.println(num1); //8
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		String str1 = String.valueOf(num1); //8
		System.out.println(str1);
		String str2 = String.valueOf(num2);
		System.out.println(str2);
	}

}
