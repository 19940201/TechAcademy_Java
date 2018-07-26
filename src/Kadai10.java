
public class Kadai10 {

	public static void main(String[] args) {

		System.out.print("       ");
		for (int i = 1; i <= 9; i++) {
			System.out.print(String.format("%3s", 1 * i + " "));
		}
		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "の段  ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(String.format("%3s", i * j + " "));
			}
			System.out.println("");
		}


	}

}
