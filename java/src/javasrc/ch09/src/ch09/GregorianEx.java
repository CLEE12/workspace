package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar; //Ctrl + Shift + O ������ �ѹ��� �� �θ� �� �ִ�.

public class GregorianEx {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		//int year = gc.get(GregorianCalendar.YEAR; //�ؿ� SimpleDateFormat ���� �ϴ°� ����.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd (a)hh:mm:ss (E)");
		Date date = gc.getTime();
		System.out.println(sdf.format(date));
		
		GregorianCalendar g1 = new GregorianCalendar(2012,2,1);
		if(g1.isLeapYear(2012)) System.out.println("����");
		else System.out.println("���");
	}

}
