package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		int[] copyArr2 = Arrays.copyOfRange(arr, 2, 4);
		
		System.out.println(Arrays.toString(copyArr));
		
		//新しい配列なので参照先は違う
		System.out.println(copyArr == arr);
		
		System.out.println(Arrays.toString(copyArr2));
		
		//配列をリスト系オブジェクトに変換
		Integer[] arr2 = {1,2,3,4,5};
		
		List<Integer> list = Arrays.asList(arr2);
		System.out.println(list);
		
		//Stream(配列)に変換
		
		int[] arr3 = {1,2,3,4,5};
		
		List<String> ist = Arrays.stream(arr3)
				.mapToObj(e -> String.valueOf(e + 5))
				.collect(Collectors.toList());
		System.out.println(ist);
		
		//配列のソート
		int[] arr4 = {6,4,1,2,5};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		//降順
		Integer[] arr5 = {6,4,1,2,5};
		Arrays.sort(arr5, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr5));

	}

}
