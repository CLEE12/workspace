package ch12;

import java.util.ArrayList;

class BeforeTh extends Thread {
	public BeforeTh(String title) {
		super(title);
	}
	public void addCar() {
		//JoinTest�� �������� �ʾҴµ� ����Ϸ��� Jointest�� 
		// ���� .list��� static�� �־�� �Ѵ�.
		JoinTest.list .add("GDi 520"); 
		JoinTest.list .add("Aventador");
		JoinTest.list .add("Veyron");
		JoinTest.list .add("500c");
	}
	public void run() {
		System.out.println(getName()+"����");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) { }
		addCar();
	}
}
class AfterTh extends Thread {
	public AfterTh(String title) {
		super(title);
	}
	public void run() {
		System.out.println(getName()+"����");
		for(String str : JoinTest.list) {
			System.err.println(str);
		}
	}
}
public class JoinTest {

	public static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		BeforeTh bt = new BeforeTh("���");
		AfterTh at = new AfterTh("���");
		bt.start(); bt.join();
		at.start();
		
		
	}

}
