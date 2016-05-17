package ch12;
class Thread6 extends Thread {
	public void run() {
		while(true) {
			try { Thread.sleep(300);
			} 
			catch (Exception e) { }
			System.out.println("졸리다"); //무한으로 재생 됨.
		}
	}
}
public class DaemonTh {
	public static void main(String[] args) {
		Thread6 th = new Thread6();
		th.setDaemon(true); //종료될때 같이 끝낼 수 있게. 이게 없으면 안끝남.
		th.start();
		for(int i=0; i<10; i++) {
			try { Thread.sleep(300);
			} 
			catch (Exception e) { }
			System.out.println("재밌네 뻥이야"); // 10번 실행되고 끝남.
		}
	}

}
