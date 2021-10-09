package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Decimal {
	
	public static Scanner scan;

	public static void main(String[] args) {
		System.out.println("16進数を入力してください(マイナス値は扱えません)");
		scan = new Scanner(System.in);
		String hexa = scan.next();
		ChangeDecimal(hexa);
	}
	
	static void ChangeDecimal(String hexa) {
		Map<String,Integer> hexaMap = new HashMap<>();
		String[] hexa_all = {"0","1","2","3","4","5",
				"6","7","8","9","A","B","C","D","E","F"};
		for (int i = 0; i < 16; i++) {
			hexaMap.put(hexa_all[i], i);
		}
		
		int sum = 0;
		for (int j = 0; j < hexa.length(); j++) {
			int num = hexaMap.get(hexa.substring(j,j + 1).toUpperCase());
			sum = 16 * sum + num;
		}
		System.out.println(sum);

	}

}
