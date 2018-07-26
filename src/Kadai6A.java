
public class Kadai6A {

	public static void main(String[] args) {
		int weight = 5;
		int carriage = 0;

		//送料の判定
		if(0 <= weight && weight < 1) {
			carriage = 250;
		}else if(1 <= weight && weight < 3) {
			carriage = 400;
		}else if(3 <= weight && weight < 5) {
			carriage = 500;
		}else if(5 <= weight && weight <=10) {
			carriage = 900;
		}else if(10 <= weight) {
			carriage = 1200;
		}else {
			carriage = 0;
		}

		//出力
		if (carriage > 0) {
			System.out.println("この荷物の重さは" + weight + "キロで送料は" + carriage + "円です");
		}else {
			System.out.println("入力データエラーです");
		}
	}

}
