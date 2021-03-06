package example;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatePhonebook {

	public static void main(String[] args) {
		
		String[] names1 = {"キシモト", "イトウ", "ババ", "カネダ", "ワダ", "ハマダ"};
		String[] names2 = {"フクダ", "キムラ", "タナカ", "ハシモト", "オカモト", "ゴトウ"};
		String[] names3 = {"ワタナベ", "ヨシダ", "マツモト", "ナガタ", "ドウモト", "タチバナ","チバ"};
		PhoneBook(names1);
		PhoneBook(names2);
		PhoneBook(names3);

	}
	
	static void PhoneBook(String[] names) {
		ArrayList<ArrayList<String>> namelists = new ArrayList<ArrayList<String>>();
		
		String[] initial = {"ア","カ","サ","タ","ナ","ハ","マ","ヤ","ラ","ワ"};
		String[][] strs = {{"ア,イ,ウ,エ,オ"},
				{"カ,キ,ク,ケ,コ,ガ,ギ,グ,ゲ,ゴ"},
				{"サ,シ,ス,セ,ソ,ザ,ジ,ズ,ゼ,ゾ"},
				{"タ,チ,ツ,テ,ト,ダ,ジ,ヅ,デ,ド"},
				{"ナ,ニ,ヌ,ネ,ノ"},
				{"ハ,ヒ,フ,へ,ホ,バ,ビ,ブ,ベ,ボ,パ,ピ,プ,ペ,ポ"},
				{"マ,ミ,ム,メ,モ"},
				{"ヤ,ユ,ヨ"},
				{"ラ,リ,ル,レ,ロ"},
				{"ワ,ヲ,ン"}};
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < names.length; j++) {
				if (Arrays.toString(strs[i]).contains(names[j].substring(0,1))) {
	                ArrayList<String> namelist = new ArrayList<String>();
	                namelist.add(initial[i]);
					namelist.add("[" + names[j] + "]");
					namelists.add(namelist);
					
				}
			}

		}
		System.out.println(namelists);

	}
	
	

}
