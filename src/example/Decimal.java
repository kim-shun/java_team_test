package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Decimal {
	
	public static Scanner scan;

	public static void main(String[] args) {
		System.out.println("16進数を入力してください");
		scan = new Scanner(System.in);
		String hexa = scan.next();
		ChangeDecimal(hexa);
	}
	
	static void ChangeDecimal(String hexa) {
		Map<String,Integer> hexaMap = new HashMap<>();
		hexaMap.put("0", 0);
		hexaMap.put("1", 1);
		hexaMap.put("2", 2);
		hexaMap.put("3", 3);
		hexaMap.put("4", 4);
		hexaMap.put("5", 5);
		hexaMap.put("6", 6);
		hexaMap.put("7", 7);
		hexaMap.put("8", 8);
		hexaMap.put("9", 9);
		hexaMap.put("A", 10);
		hexaMap.put("B", 11);
		hexaMap.put("C", 12);
		hexaMap.put("D", 13);
		hexaMap.put("E", 14);
		hexaMap.put("F", 15);
		
		int n = hexa.length();
		int sum = 0;
		for (int i = 0; i < hexa.length(); i++) {
			double num = hexaMap.get(hexa.substring(i,i + 1).toUpperCase()) * (Math.pow(16, n-1));
			sum += num;
			n -= 1;
		}
		System.out.println(sum);

	}

}
