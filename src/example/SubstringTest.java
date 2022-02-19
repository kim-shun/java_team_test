package example;

public class SubstringTest {

	public static void main(String[] args) {
		String strDate = "19/12/06 09:23:00";
		System.out.println(strDate.substring(2,3));
		
		if (strDate.substring(2,3).equals("/")) {
			System.out.println("正解です");
		} else {
			System.out.println("間違いです");
		}
		

	}

}
