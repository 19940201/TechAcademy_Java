
import java.util.Calendar;

public class DateCalendar {

	public static void main(String[] args) {

		//メッセージを出力
		System.out.println(getDayOfTheWeek());
	}



	public static String getDayOfTheWeek() {
		Calendar cal = Calendar.getInstance();//現在の曜日を取得

		//曜日からメッセージを決める
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
		case Calendar.TUESDAY:
		case Calendar.WEDNESDAY:
		case Calendar.THURSDAY:
		case Calendar.FRIDAY:
			return "お仕事頑張りましょう";
		case Calendar.SATURDAY:
		case Calendar.SUNDAY:
			return "今日はおやすみです";
		}
		throw new IllegalStateException();
	}

	{

	}

}
