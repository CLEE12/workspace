package ch05;

class Shape {
	final int TRIANGLE  = 1;
	final int RECTANGLE = 2;
	final int CIRCLE    = 3;
	Shape() {} //default ������, ������ �ڵ����� ����� ��/
	//�����ڴ� class�̸��� ���� �����ڴ� ���ϰ��� ����.
	
	//return ��
	void draw(int a) {
		if(a==1) System.out.println("�ﰢ���� �׸���.");
		else if(a==2) System.out.println("�簢���� �׸���.");
		else if(a==3) System.out.println("���� �׸���.");
		else System.out.println("�θ�� �Ⱥθ� ����´�.");
	}
}

public class ShapeEx {
	public static void main(String[] args) {
		Shape sh = new Shape();
		for(int i=1; i<=3; i++) {
			sh.draw(i);
		}
	}
}
