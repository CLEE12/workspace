package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar; //Ctrl + Shift + O 누르면 한번에 다 부를 수 있다.

public class GregorianEx {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		//int year = gc.get(GregorianCalendar.YEAR; //밑에 SimpleDateFormat 으로 하는걸 권장.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd (a)hh:mm:ss (E)");
		Date date = gc.getTime();
		System.out.println(sdf.format(date));
		
		GregorianCalendar g1 = new GregorianCalendar(2012,2,1);
		if(g1.isLeapYear(2012)) System.out.println("윤년");
		else System.out.println("평년");
	}

}
