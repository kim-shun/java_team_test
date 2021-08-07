package example;

public class Count {
	
	void countHi(String str) {
//		int count = 0;

        int num = str.indexOf("hi", 1);
        System.out.println(num);
        //indexofの第2引数は検索開始位置の指定(ない場合は-1)

//        for(int i = 0; i < num+1; i++){
//            num = str.indexOf("hi", num+1);
//            count++;
//        }
//        System.out.println(count);
	}

}
