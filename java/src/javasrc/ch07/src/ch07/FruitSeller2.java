package ch07;

public class FruitSeller2 {
	int numofApple = 20;
	int balance = 0;
	final int PRICE = 1000;
	String name;
	public FruitSeller2(String name) { //»ý¼ºÀÚ.
		this.name=name;
	}
	int sale (int money) {
		int num = money/PRICE;
		numofApple -= num;
		balance += money;
		return num;
	}
	void print() {
		System.out.println(name+" ÀÜ·® : "+numofApple);
		System.out.println("       ÀÜ°í : "+balance);
	}
}
class FruitBuyer2 {
	String name;
	public FruitBuyer2(String name) {
		this.name=name;
	}
	int numofApple = 0; int balance = 10000;
	void buy(FruitSeller2 seller, int money) {
		int num = seller.sale(money); numofApple+=num;
		money -= money;
	}
	void print() {
		System.out.println(name+" °úÀÏ : "+numofApple);
		System.out.println("       ÀÜ°í : "+balance);
	}
	
}
