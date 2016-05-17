package ch03;

public class Ran {
	public static void main(String[] args) {
		//double d1 = Math.random(); //0이상 1미만의 실수값이 나옴.
		//double d1 = Math.random() * 10; //0이상 10미만의 실수값이 나옴.
		//int d1 = (int)(Math.random() * 10); //0이상 10 미만의 정수값이 나옴.
		int d1 = (int)(Math.random() * 10) + 1; //1~10사이의 정수.
		System.out.println("d1 = "+d1);
	}

}
