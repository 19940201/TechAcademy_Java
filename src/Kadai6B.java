
public class Kadai6B {

	//出力
	public static void main(String[] args) {
		String address = "東京都";
		int carriage = calculateCarriage(address);
		if(carriage >0) {
			System.out.println(address + "への送料は" + carriage + "円です");
		}else {
			System.out.println("入力データエラーです");
		}
	}

	//送料の判定
	public static int calculateCarriage(String address) {
		int carriage =0;
		if(address.equals("北海道")) {
			carriage = 1000;
		}else if(address.equals("九州") || address.equals("沖縄")) {
			carriage = 950;
		}else if(address.equals("東北") || address.equals("中国")) {
			carriage = 800;
		}else if(address.equals("関東") || address.equals("甲信越") || address.equals("四国")) {
			carriage = 700;
		}else if(address.equals("中部")) {
			carriage = 650;
		}else if(address.equals("近畿")) {
			carriage = 600;
		}else {
			carriage = 0;
		}

		return carriage;
	}

}
