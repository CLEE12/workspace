package ch05;
class BoxDi {
	int width, height, depth; //����Ӽ�����
	String object=""; 
	Car myCar; //�����������
	//�޼ҵ�: ��ȯ�� �޼ҵ��() {���๮;}
	void print() {
		int volume = width * height * depth;
		System.out.println(object+"�� ���Ǵ� "+volume+"�Դϴ�.");
	}
}

public class Box{ //main�� ���� Ŭ�������̶� ���ƾ� �Ѵ�.
	public static void main(String[] args) {
		BoxDi d1 = new BoxDi();
		BoxDi d2 = new BoxDi();
		d1.width = 15;
		d1.height= 20;
		d1.depth = 10;
		d2.width =  7;
		d2.height= 12;
		d2.depth =	5;
		d1.object="A";
		d2.object="B";
		d1.print();
		d2.print();
	}
}
