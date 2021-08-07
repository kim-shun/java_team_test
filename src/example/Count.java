package example;

public class Count {
	
	void countHi(String str) {
		int count = 0;

        int num = str.indexOf("hi");

        for(int i = 0; i < num+1; i++){
            num = str.indexOf("hi", num+1);
            count++;
        }
        System.out.println(count);
	}

}
