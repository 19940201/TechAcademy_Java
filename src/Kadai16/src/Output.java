import java.math.BigDecimal;

public class Output {

	public static void main(String[] args) {

		int people = 15;
		if (people <= 0) {
			System.out.println("入力データエラーです");
			return;
		}
		Price cus1 = new Price(people);
		BigDecimal cus1Price= cus1.priceDecision();
		if (people <= 0) {
			return;
		}
		BigDecimal cus1UnitPrice = cus1.unitPriceDecision();
		System.out.println(people +  "人で" + cus1Price + "円");
		System.out.println("1人あたり" + cus1UnitPrice + "円");



	}

}

