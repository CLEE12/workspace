package ch05;

public class Area {
	public static void main(String[] args) {
		//final ������ �빮�ڷ� ���°��� ����. �۾��� �ľ��ϱ� ���� �빮�� or ǥ��.
		final double PI = 3.141592; 
		//final�� ���� �Ǹ� 3.14�� �ش��ϴ� ���� ������ �� ����.
		//final ������ ���ǵ� ���� ���� �Ұ�
		int r = 10;
		int area = (int)(PI * r * r);
		//double area = pi * r * r;
		System.out.println("���� ���� : "+area);
	}

}
