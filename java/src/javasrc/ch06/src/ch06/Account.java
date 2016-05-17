package ch06;

public class Account {
	String no; String name; int balance;
	Account(String n, String nm, int b) {
		no = n; name = nm; balance = b;
	}
	void deposit(int amt) {
		balance += amt; 
		System.out.println(name+"¥‘ ¿‘±› : "+amt);
	}
	void withdraw(int amt) {
		if (balance <amt)
			System.out.println("¿‹æ◊∫∏¥Ÿ ∏π¿Ã √£æÓ! ø°æÓ µµµœ≥!");
		else { balance -= amt;
		System.out.println(name+"¥‘ √‚±› : "+amt);
		}
	}
	int getBalance() {
		return balance;
	}

}
