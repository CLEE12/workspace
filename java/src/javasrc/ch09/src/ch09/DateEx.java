package ch09;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date(); //import ����� ��.
		System.out.println(date);
		int year = date.getYear();
		int month = date.getMonth()+1; //month�� 0���� �����ϹǷ� ����� ��.
		int day = date.getDay();
		System.out.println(year+"�� "+month+"�� "+day+"��");
	}
	

}
