
public class Customer {

	// フィールド
	private int age;//年齢
	private boolean isLady;//性別
	private boolean isFirstday;// 映画の日
	private boolean isWednesday;// 曜日
	private boolean isLate;// 時間
	private boolean isThreeD;// 3D
	private int price;// 料金

	// デフォルトコンストラクタ
	Customer() {
	}

	// 引数ありコンストラクタ
	Customer(int age, boolean isLady, boolean isFirstday, boolean isWednesday, boolean isLate, boolean isThreeD) {
		this.age = age;
		this.isLady = isLady;
		this.isFirstday = isFirstday;
		this.isWednesday = isWednesday;
		this.isLate = isLate;
		this.isThreeD = isThreeD;
		this.price = 0;
	}

	public int getPrice() {
		return price;
	}

	//料金を判定するメソッド
	public void priceDecision() {
		//基本料金
		if (age >= 23) {
			price = 1800;
		} else if (22 >= age && age >= 19) {
			price = 1500;
		} else if (18 >= age && age >= 16) {
			price = 1200;
		} else if (15 >= age && age >= 7) {
			price = 1000;
		} else if (6 >= age && age >= 0) {
			price = 0;
		} else {
			System.out.println("入力データエラーです");
			return;
		}

		// 割引　映画の日
		if (isFirstday == true && price > 1000) {
			price = 1000;
		}
		// 割引　レディースデイ
		if (isLady == true && isWednesday == true && price > 1200) {
			price = 1200;
		}

		// 割引　レイトショー
		if (isLate == true && price > 1500) {
			price = 1500;
		}

		// その他
		if (isThreeD == true) {
			price = price + 400;
		}

	}
}
