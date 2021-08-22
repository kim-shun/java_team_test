package example;

public class CountCode {

	public static void main(String[] args) {
		CountCode str1 = new CountCode();
		str1.countCode("codexxcode");
		
		CountCode str2 = new CountCode();
		str2.countCode("aaacodebbb");
		
		CountCode str3 = new CountCode();
		str3.countCode("cozexxcode");
	}
	
	void countCode(String str) {
		System.out.println((int)str.indexOf("code", 0) + 1);
	}

}
