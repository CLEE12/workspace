package ch12;
public class Account2 {
	private int total; private String bank;
	public Account2(int total,String bank) {	
		this.total = total;	 this.bank = bank;
	}
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(bank+"통장 "+name+" 입금 : "+amt);
	}
	void withdraw(int amt, String name) {
		if (total<amt) {
			System.out.println(bank+"통장 "+name+"! 약 오르지 돈이 없네");
		} else { total -= amt;
			System.out.println(bank+"통장 "+name+" 출금 : " +amt);	
		}
	}
	void getTotal() {
		System.out.println(bank+"통장 현재 잔액 : "+total);
		System.out.println("======================");
	}
}
