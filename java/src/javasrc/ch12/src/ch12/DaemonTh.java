package ch12;
class Thread6 extends Thread {
	public void run() {
		while(true) {
			try { Thread.sleep(300);
			} 
			catch (Exception e) { }
			System.out.println("������"); //�������� ��� ��.
		}
	}
}
public class DaemonTh {
	public static void main(String[] args) {
		Thread6 th = new Thread6();
		th.setDaemon(true); //����ɶ� ���� ���� �� �ְ�. �̰� ������ �ȳ���.
		th.start();
		for(int i=0; i<10; i++) {
			try { Thread.sleep(300);
			} 
			catch (Exception e) { }
			System.out.println("��ճ� ���̾�"); // 10�� ����ǰ� ����.
		}
	}

}
