package ch03;

public class If8 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if (num < 10) 
			System.out.println("10�̸��� ���Դϴ�.");
		else if (num < 100) 
			System.out.println("10�̻� 100�̸��� �� �Դϴ�.");
		else if (num < 1000)
			System.out.println("100 �̻� 1000 �̸��� �� �Դϴ�.");
		else if (num >= 1000)
			System.out.println("1000 �̻��� �� �Դϴ�.");
	}

}
