package ch12;

import javax.swing.JOptionPane;

public class Thread4 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<5; i++) {
			Thread.sleep(1000); //1000 = 1�� �� ����.
			System.out.println(i);
		}
		String msg = JOptionPane.showInputDialog("������ ����?");
		System.out.println("���� �޼��� : "+msg);
	}
}
