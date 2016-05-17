package ch12;

import java.util.ArrayList;

class BeforeTh extends Thread {
	public BeforeTh(String title) {
		super(title);
	}
	public void addCar() {
		//JoinTest를 생성하지 않았는데 사용하려면 Jointest에 
		// 대한 .list라는 static이 있어야 한다.
		JoinTest.list .add("GDi 520"); 
		JoinTest.list .add("Aventador");
		JoinTest.list .add("Veyron");
		JoinTest.list .add("500c");
	}
	public void run() {
		System.out.println(getName()+"실행");
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
		System.out.println(getName()+"실행");
		for(String str : JoinTest.list) {
			System.err.println(str);
		}
	}
}
public class JoinTest {

	public static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		BeforeTh bt = new BeforeTh("대박");
		AfterTh at = new AfterTh("사건");
		bt.start(); bt.join();
		at.start();
		
		
	}

}
