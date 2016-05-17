package ch09;

import java.util.Calendar;

public class CalandarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String wk = null;
		switch(week) {
		case 1 : wk = "Sunday"; break;
		case 2 : wk = "Monday"; break;
		case 3 : wk = "Tuesday"; break;
		case 4 : wk = "Wednesday"; break;
		case 5 : wk = "Thursday"; break;
		case 6 : wk = "Friday"; break;
		case 7 : wk = "Saturday"; break;
		}
		
		System.out.printf("%d%d%d %d:%d\n",year,month,date,hour,min);
		System.out.println(cal.getTime());
		System.out.println(wk);
	}

}
