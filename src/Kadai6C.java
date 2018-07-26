
public class Kadai6C {

	public static void main(String[] args) {
		//出力
		int distance = 100;
		int carriage = calculateCarriage(distance);
		if (carriage > 0) {
			System.out.println(distance + "キロ先に荷物を送るための送料は" + carriage + "円です");
		} else {
			System.out.println("入力データエラーです");
		}
	}

	//送料の判定
	public static int calculateCarriage(int distance) {
		int carriage;
		if (0 <= distance && distance < 100) {
			carriage = 600;
		}else if (100 <= distance && distance < 250) {
			carriage = 800;
		}else if(250 <= distance && distance < 500) {
			carriage = 900;
		}else if(500 <= distance){
			carriage = 1200;
		}else {
			carriage = 0;
		}

		return carriage;
	}

}
