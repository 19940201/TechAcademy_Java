
public class Kadai4 {

	public static void main(String[] args) {
		int withoutTax = 399;
		double taxRate =0.08;
		int result;
		result = tax(withoutTax,taxRate);

		System.out.println(withoutTax + "円の商品の税込み価格は" + (withoutTax + result) + "円（消費税は" + result + "円）です。");
	}

	public static int tax(int withoutTax, double taxRate){
		int result = (int) (withoutTax * taxRate);
		return result;
	}



}
