package ch05;

class CardEx {
	String shape;
	int num;
	static int width;
	static int height;
	
	void print() {
	System.out.println("ī���� ����� "+shape+"�̰�, ���ڴ� "+num+"�̴�.");
	System.out.println("ī���� �ʺ�� "+width+"�̰�, ���̴� "+height+"�̴�.");
}
}

public class Card {
	public static void main(String[] args) {
		CardEx c1 = new CardEx();
		CardEx c2 = new CardEx();
		c1.shape = "Spade";
		c1.num   = 8;
		c2.shape = "Heart";
		c2.num   = 10;
		CardEx.width = 100;
		CardEx.height= 250;
		c1.print();
		c2.print();
	}
}
	
