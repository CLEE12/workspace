package ch13;
import java.awt.*;
public class Awt03 extends Frame { //�������� ��ӹ���. �θ��� �������
	Awt03(String title) {
		//super(title);  //�����ڸ� ���ؼ� �Է�
		setTitle(title); //�޼ҵ带 ���ؼ� �Է�
		setSize(200, 200);
		setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[] args) {
		//Awt03 f1 = new Awt03();		
		new Awt03("���"); //<--�Ϲ������� Awt�� �����Ҷ� �̷��� ��� ��.
		
	}
}