package ch05;

public class CarEx {
	public static void main(String[] args) {
	//Ŭ������ ���۷����� (��ü��)	
		Car myCar; //��ü ����
		myCar = new Car(); //��ü ����
		Car yourCar = new Car(); // ����� ������ ����
		//��ü�� �����ϴ� ���: ���۷���������+.+������(�޼ҵ��)
		myCar.name = "�ҳ�Ÿ";
		myCar.color = "����";
		yourCar.name = "����Ÿ";
		yourCar.color = "���";
		//yourCar.color = "�˻�";
		System.out.println("�̸�: "+myCar.name);
		System.out.println("����: "+myCar.color);
		System.out.println("�ӵ�: "+myCar.speed);
		System.out.println("\n�̸�: "+yourCar.name);
		System.out.println("����: "+yourCar.color);
		System.out.println("�ӵ�: "+yourCar.speed);
		//��������, �޼ҵ� �ȿ��� ������ ����
		//���������� �ʱ�ȭ �ؾ� ����� �� �ִ�.
		
		String s1 = "";
		System.out.println("\n���� :"+s1);
	}

}
