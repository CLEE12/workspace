package ch13;

import java.awt.Frame;

public class Awt01 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Awt Test");
		f1.setSize(400,400); //�̹��� ������ picxel
		f1.setLocation(200,200); // ���� �𼭸��� ��ġ ����
		//f1.setBound(200,200,400,400) x,y,����,����
		f1.setVisible(true); 
	}
}
