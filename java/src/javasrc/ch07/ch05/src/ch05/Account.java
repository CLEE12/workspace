package ch05;

public class Account {
	String no;
	String name;
	int balance;
	
	Account(String n, String nm, int b) {
	no = n;
	name = nm;
	balance = b;
	}
	void deposit(int amt) {
		balance += amt;
		System.out.println(name+"�� "+amt+"�� �Ա� �ϼ̽��ϴ�.");
	}
	void withdraw(int amt) {
		if(amt>0){
		if(balance < amt) System.out.println(name+"�� ���� �ܾ��� �����մϴ�.");
		balance -= amt;
		System.out.println(name+"�� "+amt+"�� ��� �ϼ̽��ϴ�.");
	}
	}
	void getBalance() {
		System.out.println(name+"�� ���� �ܰ� : "+balance);
	}
}