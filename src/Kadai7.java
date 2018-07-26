
public class Kadai7 {

	public static void main(String[] args) {

		String myBlood = "A";
		String yourBlood = "A";

		if(myBlood.equals(yourBlood)) {
		if (myBlood.equals(yourBlood)) {
			System.out.println("あなたの思い通りに物事が進みそうです");
		}else {
		} else {
			System.out.println("余裕を持った行動を心がけて");
		}

		if (yourBlood.equals("A")) {
			System.out.println("ゆったりとした気分で過ごせそう");
		} else if (yourBlood.equals("B")) {
			System.out.println("なりたい自分を思い描いて");
		} else if (yourBlood.equals("O")) {
			System.out.println("情報収集が吉");
		} else if (yourBlood.equals("AB")) {
			System.out.println("本当に大切なものが見えてきそう");
		} else {
			if(myBlood == yourBlood) {
				System.out.println("余裕を持った行動を心がけて");
			}else {return;
			}
		}

	}

}
