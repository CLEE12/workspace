package ch05;

public class Car3Ex {
	public static void main(String[] args) {
		Car3.color = "����"; 
		//�ؿ� c1.color�� ���ų� �̰� ���ų� �������. 
		//������ static���� �����ϱ� ������.
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		
		c1.name  = "����";
		//c1.color = "���";
		//c2.color = "�ʷ�"; 
		//static�� ���� c1, c2 ������� �� ���� ���� �ȴ�.
		c2.name  = "�ƿ��";
		c1.print();
		c2.print();
	}

}
