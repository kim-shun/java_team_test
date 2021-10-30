package example;

public class IndexOfSample {

	public static void main(String[] args) {
		String s = "あいうえおかきくけこあいうえおかきくけこ";
		int n = s.indexOf("かきくけこ");
		System.out.println(n);
		
		n = s.indexOf("かきくけこ", 10);
		System.out.println(n);
		
		n = s.indexOf("さしすせそ");
		System.out.println(n);
	}

}
