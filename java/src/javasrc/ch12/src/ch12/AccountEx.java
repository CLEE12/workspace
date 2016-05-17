package ch12;
public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000,"신한은행");
		Account act2 = new Account(5000,"국민은행");
		AccountUser au1 = new AccountUser("설현", act);
		AccountUser au2 = new AccountUser("동진", act);
		AccountUser au3 = new AccountUser("하니", act);
		AccountUser au4 = new AccountUser("설현", act2);
		AccountUser au5 = new AccountUser("동진", act2);
		AccountUser au6 = new AccountUser("하니", act2);
		au1.start();  au2.start(); au3.start(); 
		au4.start();  au5.start(); au6.start(); 
	}
}
