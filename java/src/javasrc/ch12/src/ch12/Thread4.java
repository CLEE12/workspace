package ch12;

import javax.swing.JOptionPane;

public class Thread4 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<5; i++) {
			Thread.sleep(1000); //1000 = 1초 씩 쉰다.
			System.out.println(i);
		}
		String msg = JOptionPane.showInputDialog("전달할 말은?");
		System.out.println("전달 메세지 : "+msg);
	}
}
