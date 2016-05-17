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
		System.out.println(bank+"통장 "+name+"입금 : "+amt);
	}
	synchronized void withdraw(int amt, String name) {
		if(total<amt) {
			System.out.println(bank+"통장 "+name+"! 약 오르지 돈이 없네");
		}
		else { total -= amt;
		System.out.println(bank+"통장 "+name+"출금 : "+amt);
		}
	}
	void getTotal() {
		System.out.println("현재 잔액 : "+total);
		System.out.println("=====================");
	}
}
