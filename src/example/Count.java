package example;

public class Count {
	
	void countHi(String str) {
		int index = 0;
		int count = 0;
		while(true) {
		    index = str.indexOf("hi", index) + 1;
		    if (index == 0) break;
		    count++;
		}
		System.out.println(count);
	}

}
