package example;

import java.util.Arrays;
import java.util.Comparator;

public class CharaTest {

	public static void main(String[] args) {
		Chara[] ch = new Chara[3];
		ch[0] = new Chara("勇者", 50);
		ch[1] = new Chara("傍観者", 99);
		ch[2] = new Chara("魔法使い", 20);
		
		Arrays.sort(ch, new CharaComparator());
		System.out.println(Arrays.toString(ch));
	}
}

class CharaComparator implements Comparator<Chara> {
	@Override
	public int compare(Chara o1, Chara o2) {
		return o2.lv - o1.lv;
	}
}

class Chara {
	String name;
	int lv;
	Chara(String name, int lv) {
		this.name = name;
		this.lv = lv;
	}
	public String toString() {
		return name;
	}
}
