package ch07;

public class FruitSeller1 {
	int numofApple = 20;
	int balance = 0;
	final int PRICE = 1000;
	int sale (int money) {
		int num = money/PRICE;
		numofApple -= num;
		balance += money;
		return num;
	}
	void print() {
		System.out.println("판매상 잔량 : "+numofApple);
		System.out.println("판매상잔고 : "+balance);
	}
}
class FruitBuyer1 {
	int numofApple = 0; int balance = 10000;
	void buy(FruitSeller1 seller, int money) {
		int num = seller.sale(money); numofApple+=num;
		money -= money;
	}
	void print() {
		System.out.println("구매자 과일 : "+numofApple);
		System.out.println("구매자 잔고 : "+balance);
	}
	
}
