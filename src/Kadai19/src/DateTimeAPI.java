
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeAPI {

	public static void main(String[] args) {

		//現在日時を取得
		LocalDate ldt = LocalDate.now();

		//曜日を取得
		DayOfWeek week = ldt.getDayOfWeek();

		//メッセージを出力
		if (week == DayOfWeek.MONDAY || week == DayOfWeek.TUESDAY || week == DayOfWeek.WEDNESDAY || week == DayOfWeek.THURSDAY || week== DayOfWeek.FRIDAY){
			System.out.println("お仕事頑張りましょう");
		} else{
			System.out.println("今日はおやすみです");
		}


	}

}
