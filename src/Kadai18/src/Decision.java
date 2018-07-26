public class Decision {

	//フィールド
	private static double height;//身長(m)
	private static double weight;//体重(kg)

	//コンストラクタ
	public Decision() {
	}

	//引数ありコンストラクタ
	public Decision(double height, double weight) {

		this.setHeight(height);
		this.setWeight(weight);
	}

	//セッターゲッター
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		Decision.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		Decision.weight = weight;
	}

}