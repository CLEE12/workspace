package ch12;
public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000,"��������");
		Account act2 = new Account(5000,"��������");
		AccountUser au1 = new AccountUser("����", act);
		AccountUser au2 = new AccountUser("����", act);
		AccountUser au3 = new AccountUser("�ϴ�", act);
		AccountUser au4 = new AccountUser("����", act2);
		AccountUser au5 = new AccountUser("����", act2);
		AccountUser au6 = new AccountUser("�ϴ�", act2);
		au1.start();  au2.start(); au3.start(); 
		au4.start();  au5.start(); au6.start(); 
	}
}
