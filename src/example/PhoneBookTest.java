package example;

import java.util.ArrayList;

public class PhoneBookTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append("DEF");
		System.out.println(sb.toString());  // ABCDEF

		sb.insert(2, "XYZ");
		System.out.println(sb.toString());  // ABXYZCDEF
		
		ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
		for (int i =0; i < 3; i++) {
			ArrayList<String> list = new ArrayList<String>();
			for (int j = 0; j < 3; j++) {
				list.add("あ");
				list.add(1,"い");
			}
			lists.add(list);
		}
		System.out.println(lists);
		
		//実行結果 [["ア", ["イトウ"]], ["カ", ["カネダ", "キシモト"]], ["ハ", ["ハマダ", "ババ"]], ["ワ", ["ワダ"]]]
		//実行結果 [["ア", ["オカモト"]], ["カ", ["キムラ", "ゴトウ"]], ["タ", ["タナカ"]], ["ハ", ["ハシモト", "フクダ"]]]
		//実行結果 [["タ", ["タチバナ", "チバ", "ドウモト"]], ["ナ", ["ナガタ"]], ["マ", ["マツモト"]], ["ヤ", ["ヨシダ"]], ["ワ", ["ワタナベ"]]]

		

	}

}
