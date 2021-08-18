package example;

public class Case {

	public static void main(String[] args) {
		int[] classCode = {1,3,2};
		String[] name = {"鈴木", "本田", "遠藤"};
		
		for (int i =0; i <3; i++) {
			System.out.print(name[i] + "さんは");
			
			switch(classCode[i]) {
			case 1:
				System.out.println("Aクラスです");
				break;
			case 2:
				System.out.println("Bクラスです");
				break;
			case 3:
				System.out.println("Cクラスです");
			}
		}

	}

}
