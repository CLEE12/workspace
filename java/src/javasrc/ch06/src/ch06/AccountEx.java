package ch06;

public class AccountEx {
	public static void main(String[] args) {
		Account ac1 = new Account("����111","����", 1000);
		Account ac2 = new Account("����111","IU", 1000);
		for(int i=0; i<5; i++) {
			int amt1 = (int)(Math.random()*10000);
			int amt2 = (int)(Math.random()*10000);
			int amt3 = (int)(Math.random()*10000);
			int amt4 = (int)(Math.random()*10000);
			ac1.deposit(amt1);
			ac1.withdraw(amt2);
			System.out.println("�ܾ�"+ac1.getBalance()+"***");
			ac2.deposit(amt3);
			ac2.withdraw(amt4);
			System.out.println("�ܾ�"+ac2.getBalance()+"***");
		}
		
	}

}
