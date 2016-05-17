package ch12;

public class Account {
	private int total;
	private String bank;
	public Account(int total, String bank) {
		this.total = total;
		this.bank = bank;
	}
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(bank+"���� "+name+"�Ա� : "+amt);
	}
	synchronized void withdraw(int amt, String name) {
		if(total<amt) {
			System.out.println(bank+"���� "+name+"! �� ������ ���� ����");
		}
		else { total -= amt;
		System.out.println(bank+"���� "+name+"��� : "+amt);
		}
	}
	void getTotal() {
		System.out.println("���� �ܾ� : "+total);
		System.out.println("=====================");
	}
}
