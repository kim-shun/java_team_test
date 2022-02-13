package example;

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
			if (Arrays.toString(strs[i]).contains(names[0].substring(0,1))) {
				System.out.println(names[0].substring(0,1) + "は" + initial[i] + "行です");
				
			}
		}
//		
//		String[] a = {"ア,イ,ウ,エ,オ"};
//		String[] ka = {"カ,キ,ク,ケ,コ,ガ,ギ,グ,ゲ,ゴ"};
//		String[] sa = {"サ,シ,ス,セ,ソ,ザ,ジ,ズ,ゼ,ゾ"};
//		String[] ta = {"タ,チ,ツ,テ,ト,ダ,ジ,ヅ,デ,ド"};
//		String[] na = {"ナ,ニ,ヌ,ネ,ノ"};
//		String[] ha = {"ハ,ヒ,フ,へ,ホ,バ,ビ,ブ,ベ,ボ,パ,ピ,プ,ペ,ポ"};
//		String[] ma = {"マ,ミ,ム,メ,モ"};
//		String[] ya = {"ヤ,ユ,ヨ"};
//		String[] ra = {"ラ,リ,ル,レ,ロ"};
//		String[] wa = {"ワ,ヲ,ン"};
//		
//		System.out.println(names[0].substring(0,1));
//		
//		
//		
//		ArrayList<ArrayList<String>> namelist = new ArrayList<ArrayList<String>>();
//		
//		System.out.println(Arrays.toString(names));
	}
	
	

}
