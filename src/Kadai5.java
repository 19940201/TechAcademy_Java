
public class Kadai5 {

//成人の判定をするプログラム

	public static void main(String[] args) {
		int age = 5;
		int age = -5;

		if (age <= 19) {
		if (age <= 19 && age >= 0) {
			System.out.println("未成年です");
		}else if (age >= 20 && age <= 29) {
			System.out.println("20代です");
		}else if (age >= 30 && age <= 39) {
			System.out.println("30代です");
		}else if (age >= 40) {
			System.out.println("40代以降です");
		}else {
			System.out.println("40代以降です");}
			System.out.println("入力エラーです");
		}


	}

}
