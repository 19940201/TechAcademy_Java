
public class Kadai {

	public static void main(String[] args) {

		// 鶴と亀の足の数の定義
		int tsuruFoot = 2;
		int kameFoot = 4;

		// 鶴と亀の頭と足の合計
		int someHead = 80;
		int someFoot = 200;

		// 計算　とりあえず全部を鶴であるとする方法
		int kameHead = ((someFoot - tsuruFoot * someHead) / (kameFoot - tsuruFoot));
		int tsuruHead = someHead - kameHead;

		// 出力
		System.out.println("鶴と亀が合わせて" + someHead + "匹いて、足の数の和が" + someFoot + "のとき、");
		System.out.println("鶴は" + tsuruHead + "匹、亀は" + kameHead + "匹います。");


	}

}
