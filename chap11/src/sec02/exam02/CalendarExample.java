package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // week가 어떤 숫자를 가지고있냐에 따라 문자열로 요일을 출력
		String strweek = null;
		switch(week) {
		case Calendar.MONDAY:
			strweek = "월";
			break;
		case Calendar.TUESDAY:
			strweek = "화";
			break;
		case Calendar.WEDNESDAY:
			strweek = "수";
			break;
		case Calendar.THURSDAY:
			strweek = "목";
			break;
		case Calendar.FRIDAY:
			strweek = "금";
			break;
		case Calendar.SATURDAY:
			strweek = "토";
			break;
		case Calendar.SUNDAY:
			strweek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String stramPm = null;
		if(amPm == Calendar.AM) {
			stramPm = "오전";
		}else {
			stramPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.MILLISECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "월");
		System.out.println(strweek + "요일");
		System.out.println(stramPm);
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}

}
