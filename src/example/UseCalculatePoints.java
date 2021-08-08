package example;

public class UseCalculatePoints {

	public static void main(String[] args) {
		Calculate amount1 = new Calculate();
		amount1.calculatePoints(500, false);
		
		Calculate amount2 = new Calculate();
		amount2.calculatePoints(2000, false);
		
		Calculate amount3 = new Calculate();
		amount3.calculatePoints(3000, true);

	}

}
