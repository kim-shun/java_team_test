package example;

public class OutsideMode {

	public static void main(String[] args) {
		in1to10(5, false);
		in1to10(11,false);
		in1to10(11,true);
	}
	
	private static void in1to10(int num, boolean outsideMode) {
		if ((num >= 1 && num <= 10) || outsideMode ) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
