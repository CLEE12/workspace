package ch07;

public class Car2Ex {
	public static void main(String[] args) {
		Car2 c1 = new Ambulance(); //�θ� �����ϰ� �ڽ��� �����ϴ� up casting�� �ƹ� ���� ����.
		Car2 c2 = new FireEngine(); 
		//Ambulance a1 = new Car2(); �ڽ��� �����ϰ� �θ� �����ϴ� down casting�� �ȵȴ�.
		//Ambulance ab1 = (Ambulance)new Car2(); //�̷��� ������ down casting�� �ַ��� �ȳ����� 
		Ambulance ab2 = (Ambulance)c1;        //�����Ҷ� �ַ��� �߻��Ѵ�.
		//Ambulance ab3 = (Ambulance)c2();
		Car2 c3 = new Car2();
		Ambulance ab4 = new Ambulance();
		//Ambulance ab5 = (Ambulance)new FireEngine(); //��Ӹ� ����
		
		c1.move();//�θ𼱾�. �ڽĴ��� //�ڽĴ��� -> �ڽĸ޼ҵ�
		c3.move();//�θ𼱾�. �θ���� //�θ���� -> �θ�޼ҵ�
		ab4.move(); //�ڽļ���. �ڽĴ��� //�ڽĴ��� -> �ڽ� �޼ҵ�
		System.out.println("k = "+c1.k);
		System.out.println("k = "+c3.k);
		System.out.println("k = "+ab4.k);
		System.out.println("=================");
		ab4.siren(); //�ڽļ��� �ڽĴ��� -> �ڽĸ޼ҵ� ��ü ���� ����.
		//�θ𼱾� �ڽĴ��� -> �θ� �ִ� �޼ҵ�� ���� �̸��� ���� ����.
		//c1.siren();
		ab2.siren(); //�θ� �ڽĿ� ������ ���� �ڽ� ��ü �޼ҵ� ��밡��.
	}

}
