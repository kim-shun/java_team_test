package example;

public class SearchArray {

	public static void main(String[] args) {
		String[] strArray = {"日本", "中国", "アメリカ", "ロシア", "韓国"};
		String searchElement = "中国";
		boolean exist = false;
		
		for (String str : strArray) {
			if (str.equals(searchElement)) {
				exist = true;
			}
		}
		
		System.out.println("配列に" + searchElement + "を含んでいる→" + exist);

	}

}
