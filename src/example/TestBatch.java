package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBatch {


	public static void main(String[] args) {
		// ② 現在時刻を取得してくる値を 変数 date に格納
        Date date = new Date();
        // SimpleDateFormat をオブジェクト化し、任意のフォーマットを設定
        SimpleDateFormat sdf = new SimpleDateFormat("yy年 M月d日");
        // フォーマット指定なし
        System.out.println(date);
        // フォーマット指定あり
        System.out.println(sdf.format(date));

	}

}
