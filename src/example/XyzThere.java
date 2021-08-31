package example;

public class XyzThere {

	public static void main(String[] args) {
		XyzThere str1 = new XyzThere();
		str1.xyzThere("abcxyz");
		str1.xyzThere("abc.xyz");
		str1.xyzThere("xyz.abc");
		str1.xyzThere("azbycx");
		str1.xyzThere("a.zbycx");
		
	}
	
	public void xyzThere(String str) {
		if (str.indexOf(".xyz", 0) != -1) {
			System.out.println("False");
		} else if (str.indexOf("xyz", 0) == -1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
