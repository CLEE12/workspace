package ch12;
//java가 단일상속만 되므로 class가 다른 class를 상속 받을때 Thread를 구현하기 위해 
class Runable1 implements Runnable {
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print("run"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}

public class RunableEx {
	public static void main(String[] args) {
		Runable1 rn1 = new Runable1();
		Thread th1 = new Thread(rn1);
		th1.start();
		for(int i=0; i<50; i++) {
			System.out.print("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}