package ch08;

public interface Lendable {
	int BORROWED = 1; //대출 //글자가 italian처럼 기울면 Fianl 적용됨.
	int NORMAL = 0;   //ㄴ대출
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
		System.out.println(borrower+"이 "+title+"을 "+date+"빌려갔다.");
	}
	public void checkIn() {
		System.out.println(borrower+"가 "+title+"을 반납했다.");
		state = NORMAL; borrower = null; date = null;
	}
}
