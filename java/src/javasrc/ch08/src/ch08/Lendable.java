package ch08;

public interface Lendable {
	int BORROWED = 1; //���� //���ڰ� italianó�� ���� Fianl �����.
	int NORMAL = 0;   //������
	void checkOut(String borrower, String date);
	void checkIn();
}
class SeperateVolume implements Lendable {
	String requestNo, title, writer, borrower, date;
	int state;
	SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}
	public void checkOut(String borrower, String date) {
		if (state == BORROWED) return;
		this.borrower = borrower; this.date = date;
		state = BORROWED;
		System.out.println(borrower+"�� "+title+"�� "+date+"��������.");
	}
	public void checkIn() {
		System.out.println(borrower+"�� "+title+"�� �ݳ��ߴ�.");
		state = NORMAL; borrower = null; date = null;
	}
}
