package example;

public class Count {
	
	void countHi(String str) {
//		int count = 0;

        //これを繰り返していきたい
        int num = str.indexOf("hi");
        System.out.println(num);

//        for(int i = 0; i < num+1; i++){
//            num = str.indexOf("hi", num+1);
//            count++;
//        }
//        System.out.println(count);
	}

}
