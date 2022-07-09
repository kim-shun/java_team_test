package example;

public class CalculationTransmissionEfficiency {

	public CalculationTransmissionEfficiency() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		//クライアントとサーバ間の回線速度(bit/sec)
		double lineSpeed = 10;
		//伝送効率(%)
		double transmissionEfficiency = 70;
		//電文長 上り(M byte)
		double telegramLengthUp = 1;
		//電文長 下り(M byte)
		double telegramLengthDown = 2;
		//クライアントの処理時間(送信・受信合わせて)(sec)
		double processingTimeClient = 0.4;
		//サーバの処理時間(送信・受信合わせて)(sec)
		double processingTimeServer = 0.4;

		double responseTime = caluculate(lineSpeed, transmissionEfficiency, telegramLengthUp, 
				telegramLengthDown, processingTimeClient, processingTimeServer);
		System.out.println(responseTime);

	}
	/**
	 *
	 *  問題を解く流れ
	 *  1.回線が1secに転送可能なデータ量を求める
	 *  2.電文を転送するのに要する時間を求める
	 *  3.クライアント、サーバの処理時間を加える
	 *
	 */
	public static double caluculate(double lineSpeed, double transmissionEfficiency, double telegramLengthUp, double telegramLengthDown,
			double processingTimeClient, double processingTimeServer) {
		//bit→byte
		double byteLineSpeed = lineSpeed / 8;
		//回線が1secに転送可能なデータ量
		double amountOfData = byteLineSpeed * (transmissionEfficiency / 100);
		//電文のデータ量の転送時間
		double transferTime = (telegramLengthUp + telegramLengthDown) / amountOfData;
		//設置場所の異なるクライアントとサーバ間で通信を行う場合の応答時間
		double responseTime = transferTime + processingTimeClient + processingTimeServer;
		
		return responseTime;

	}

}
