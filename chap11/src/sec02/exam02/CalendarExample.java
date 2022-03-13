package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // week�� � ���ڸ� �������ֳĿ� ���� ���ڿ��� ������ ���
		String strweek = null;
		switch(week) {
		case Calendar.MONDAY:
			strweek = "��";
			break;
		case Calendar.TUESDAY:
			strweek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strweek = "��";
			break;
		case Calendar.THURSDAY:
			strweek = "��";
			break;
		case Calendar.FRIDAY:
			strweek = "��";
			break;
		case Calendar.SATURDAY:
			strweek = "��";
			break;
		case Calendar.SUNDAY:
			strweek = "��";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String stramPm = null;
		if(amPm == Calendar.AM) {
			stramPm = "����";
		}else {
			stramPm = "����";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.MILLISECOND);
		
		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(strweek + "����");
		System.out.println(stramPm);
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
	}

}
