package ch12;
public class Account2Ex {
	public static void main(String[] args) {
		Account2 act = new Account2(10000,"신한은행");
		Account2 act2 = new Account2(5000,"국민은행");
		Account2User au1 = new Account2User("설현", act);
		Account2User au2 = new Account2User("동진", act);
		Account2User au3 = new Account2User("하니", act);
		Account2User au4 = new Account2User("설현", act2);
		Account2User au5 = new Account2User("동진", act2);
		Account2User au6 = new Account2User("하니", act2);
		au1.start();  au2.start(); au3.start(); 
		au4.start();  au5.start(); au6.start(); 
	}
}
