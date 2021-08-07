package example;

public class UseCountHi {

	public static void main(String[] args) {
		Count str1 = new Count();
		str1.countHi("abc hi ho");
		
		Count str2 = new Count();
		str2.countHi("ABChi hi");
		
		Count str3 = new Count();
		str3.countHi("hihi");
	}

}
