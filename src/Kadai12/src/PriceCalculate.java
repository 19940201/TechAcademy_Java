
public class PriceCalculate {
	// 映画料金計算プログラム

	public static void main(String[] args) {

		Customer cus1 = new Customer(20,true,true,true,true,true);
		cus1.priceDecision();
		int cus1Price = cus1.getPrice();
		System.out.println(cus1Price);

		Customer cus2 = new Customer(0,true,true,true,true,true);
		cus2.priceDecision();
		int cus2Price = cus2.getPrice();
		System.out.println(cus2Price);



	}

}
