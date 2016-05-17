package ch12;
public class AccountUser extends Thread {
	private boolean flag; //아무것도 안주면 false
	private String name; 
	private Account act;
	public AccountUser(String name, Account act) {
		this.name = name;
		this.act = act;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			try { Thread.sleep(500);
		} 
			catch (InterruptedException e) { }
			int amt = (int)(Math.random()*10000);
			if(flag) act.deposit(amt,name);
			else act.withdraw(amt, name);
			act.getTotal();
			flag = !flag;
		}
	}
}
