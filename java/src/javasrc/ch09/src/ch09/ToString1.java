package ch09;
class Card {
	int num;
	String kind;
	public Card(int num, String kind) {
		this.num = num; this.kind = kind;
	}
	public String toString() { //������ ���ϸ� : ��Ű��, Ŭ���� @�ؽ��ڵ�
		return "ī��[��ȣ:"+num+", ����"+kind+"]";
	}
}

public class ToString1 {
	public static void main(String[] args) {
		Card c1 = new Card(7, "Spade");
		Card c2 = new Card(10, "Heart");
		System.out.println(c1);
		System.out.println(c2.toString());
				
	}

}
