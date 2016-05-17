package ch12;
class Runnable3 implements Runnable {
	public void run() {
		for (int i=0;i<100;i++) {
		  System.out.print(Thread.currentThread().getName()+i+"\t");
		  if(i%10==9) System.out.println();
		}
	}	
}
public class Runable3Ex {
	public static void main(String[] args) {
		Runnable3 rn1=new Runnable3(); 
		Runnable3 rn2=new Runnable3();
		Runnable3 rn3=new Runnable3(); 
		Thread th1=new Thread(rn1,"대박"); 
		Thread th2=new Thread(rn2,"쪽박");
		Thread th3=new Thread(rn3,"옹박");
		th1.start(); th2.start(); th3.start();
		for (int i=0;i<100;i++) {
			System.out.print("main"+i+"\t");
			if(i%10==9) System.out.println();
		}
	}
}