package example;

public class Count {
	
//	long countHi(String str) {
//	    try (java.util.Scanner scanner = new java.util.Scanner(str)) {
//	        return scanner.findAll("hi").count();
//	    }
//	}
	
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
