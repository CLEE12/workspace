package ch12;

public class Account2User extends Thread {
	private boolean flag;
	private Account2 act;
	public Account2User(String name, Account2 act) {
		super(name); this.act = act;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			try{Thread.sleep(500);
		}catch(InterruptedException e) {}
	}synchronized (act) {			
		int amt = (int)(Math.random()*10000);
		if (flag) {
			act.deposit(amt, getName());
			act.getTotal();
		} else {act.withdraw(amt, getName());	
			  act.getTotal();			}
		flag = !flag;
	}
}
}
