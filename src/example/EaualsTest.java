package example;

public class EaualsTest {

	public static void main(String[] args) {
		String moji1 = "文字列";
	    String moji2 = "文字列";
	    String moji3 = "文字列ミス";
	    
	    if (moji2.equals(moji1)) {
	    	System.out.println("moji2は同じです");
	    }
	    
	    if (moji3.equals(moji1)) {
	    	System.out.println("moji3は同じです");
	    } else {
	    	System.out.println("moji3は同じではありません");
	    }

	}

}
