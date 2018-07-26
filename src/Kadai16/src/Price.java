import java.math.BigDecimal;

public class Price {

	// フィールド
	BigDecimal people;// 人数
	BigDecimal listPrice = new BigDecimal("750");// 定価
	BigDecimal DISCOUNT = new BigDecimal("0.75"); // 団体割引
	BigDecimal result = new BigDecimal("0");//合計金額
	BigDecimal unitPrice = new BigDecimal("0");// 単価

	// デフォルトコンストラクタ
	Price() {
	}

	// 引数ありコンストラクタ
	Price(int people) {
		this.people = BigDecimal.valueOf(people);

	}


	//一人あたりの値段を計算するメソッド
	public BigDecimal unitPriceDecision() {
		BigDecimal fourteen = new BigDecimal("14");
		unitPrice = listPrice;
		if(people.compareTo(fourteen) > 0) {
			unitPrice = listPrice.multiply(DISCOUNT);
		}
		unitPrice = unitPrice.setScale(0,BigDecimal.ROUND_HALF_DOWN);
		return unitPrice;
	}

	//料金を計算するメソッド
	public BigDecimal priceDecision() {
		unitPriceDecision();
		result = unitPrice.multiply(people);
		return result;
	}



}
