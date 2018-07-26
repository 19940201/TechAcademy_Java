
public class Output {

	public static void main(String[] args) {

		//Setter/Getter、コンストラクタ処理

		Decision person1 = new Decision();
		person1.setHeight(1.65);//Setter
		person1.setWeight(60.5);//Setter
		double hight1Value = person1.getHeight();//Getter
		double weight1Value = person1.getWeight();//Getter
		double bmi = bmiCalculation(hight1Value, weight1Value);
		bmiDecision(bmi);

	}

	public static double bmiCalculation(double hight, double weight) {
		double bmi = weight / (hight * hight);
		return bmi;
	}

	public static void bmiDecision(double bmi) {
		if (bmi > 0 && bmi < 18.5) {
			System.out.println("低体重です");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("普通体重です");
		} else if (bmi >= 25) {
			System.out.println("肥満です");
		} else {
			System.out.println("入力データエラー");
		}
	}

}