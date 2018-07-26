
public class Kadai11 {

	public static void main(String[] args) {

		//配列を生成
		String[] num = new String[100];
		//代入処理
		for (int i = 0; i <= 99; i++) {
			num[i] = i + 1 + "";
		}

		//表示
		for (String i : num) {
			System.out.println(i);

		}
	}
}
