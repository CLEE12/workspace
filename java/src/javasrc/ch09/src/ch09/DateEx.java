package ch09;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date(); //import 해줘야 함.
		System.out.println(date);
		int year = date.getYear();
		int month = date.getMonth()+1; //month는 0부터 시작하므로 해줘야 함.
		int day = date.getDay();
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
	

}
