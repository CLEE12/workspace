package ch05;
//����������  ����� Ŭ������
public class Car {
	//�������, �ʵ�, ��������
	//�迭, ������� -> ���� 0, ���ڴ� null, ������ false�� �ڵ� �ʱ�ȭ\
	public String name; //�ٸ� Ŭ�������� ������ public�� �� ��� ��.
	String color;
	public int speed; //�ٸ� Ŭ�������� ������ public�� �� ��� ��.
	//�޼ҵ�
	public void speedUp(int speed) { //�ٸ� Ŭ�������� ������ public�� �� ��� ��.
   //��ȯ�� �޼ҵ��  �Ű�����
		System.out.println(speed+"km�� �ü����� �޸���");
	}

}
