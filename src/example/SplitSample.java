package example;

public class SplitSample {

	public static void main(String[] args) {
		String str = "white,green,blue,red,,";
		String[] colors = str.split(",");
		for (int i =0; i< colors.length; i++) {
			System.out.println(i +  ":" + colors[i]);
		}
		
		System.out.println();
		
		//分割回数を指定
		String[] colors2 = str.split(",", 3);
		for (int i = 0; i< colors2.length; i++) {
			System.out.println(i +  ":" + colors2[i]);
		}
		
		System.out.println();
		
		//第二引数が0の場合
		String[] colors3 = str.split(",", 0);
		for ( int i = 0; i < colors3.length; i++) {
			System.out.println(i +  ":" + colors3[i]);
			
		}
		
		System.out.println();
		
		//第二引数が0の場合
		String[] colors4 = str.split(",", -1);
		for ( int i = 0; i < colors4.length; i++) {
			System.out.println(i +  ":" + colors4[i]);
		}
		
		System.out.println();
		
		//空白を除外
		String str2 = "white  ,green ,blue, red   ";
		String[] colors5 = str2.split("[\s]*,[\s]*");
		
		for ( int i = 0; i < colors5.length; i++) {
			System.out.println(i +  ":" + colors5[i]);
			
		}
		
		System.out.println();
		
		String[] colors6 = str2.split(",");
		
		for ( int i = 0; i < colors6.length; i++) {
			System.out.println(i +  ":" + colors6[i]);
			
		}
		
		
	}

}
