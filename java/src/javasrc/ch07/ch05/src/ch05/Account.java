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
		System.out.println(name+"´Ô "+amt+"¿ø ÀÔ±Ý ÇÏ¼Ì½À´Ï´Ù.");
	}
	void withdraw(int amt) {
		if(amt>0){
		if(balance < amt) System.out.println(name+"´Ô ÇöÀç ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		balance -= amt;
		System.out.println(name+"´Ô "+amt+"¿ø Ãâ±Ý ÇÏ¼Ì½À´Ï´Ù.");
	}
	}
	void getBalance() {
		System.out.println(name+"´Ô ÇöÀç ÀÜ°í : "+balance);
	}
}