package ch05;

public class AccountEx {
	public static void main(String[] args) {
		Account at1 = new Account("신한1111","길동",5000);
		Account at2 = new Account("국민2222","효린",10000);
		for(int i=0; i<10; i++) {
			int amt1 = (int)(Math.random()*10000);
			int amt2 = (int)(Math.random()*10000);
			at1.getBalance();
			at2.getBalance();
			at1.deposit(amt1);
			at2.deposit(amt2);
			at1.getBalance();
			at2.getBalance();
			at1.withdraw(amt2);
			at2.withdraw(amt1);
			at1.getBalance();
			at2.getBalance();
			System.out.println("--------------------");
		}
	}

}
