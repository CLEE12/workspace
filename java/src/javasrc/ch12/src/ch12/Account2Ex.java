package ch12;
public class Account2Ex {
	public static void main(String[] args) {
		Account2 act = new Account2(10000,"��������");
		Account2 act2 = new Account2(5000,"��������");
		Account2User au1 = new Account2User("����", act);
		Account2User au2 = new Account2User("����", act);
		Account2User au3 = new Account2User("�ϴ�", act);
		Account2User au4 = new Account2User("����", act2);
		Account2User au5 = new Account2User("����", act2);
		Account2User au6 = new Account2User("�ϴ�", act2);
		au1.start();  au2.start(); au3.start(); 
		au4.start();  au5.start(); au6.start(); 
	}
}
