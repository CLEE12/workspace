package ch03;

public class Ran {
	public static void main(String[] args) {
		//double d1 = Math.random(); //0�̻� 1�̸��� �Ǽ����� ����.
		//double d1 = Math.random() * 10; //0�̻� 10�̸��� �Ǽ����� ����.
		//int d1 = (int)(Math.random() * 10); //0�̻� 10 �̸��� �������� ����.
		int d1 = (int)(Math.random() * 10) + 1; //1~10������ ����.
		System.out.println("d1 = "+d1);
	}

}
