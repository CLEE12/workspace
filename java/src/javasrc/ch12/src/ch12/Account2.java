package ch12;
public class Account2 {
	private int total; private String bank;
	public Account2(int total,String bank) {	
		this.total = total;	 this.bank = bank;
	}
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(bank+"���� "+name+" �Ա� : "+amt);
	}
	void withdraw(int amt, String name) {
		if (total<amt) {
			System.out.println(bank+"���� "+name+"! �� ������ ���� ����");
		} else { total -= amt;
			System.out.println(bank+"���� "+name+" ��� : " +amt);	
		}
	}
	void getTotal() {
		System.out.println(bank+"���� ���� �ܾ� : "+total);
		System.out.println("======================");
	}
}
