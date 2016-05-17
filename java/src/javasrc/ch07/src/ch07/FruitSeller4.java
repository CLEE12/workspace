package ch07;

public class FruitSeller4 {
	String name;
	int numOfApple;
	int balance;
	final int PRICE = 1000;
	
	public FruitSeller4(String name, int numOfApple, int balance ) {
		this.name = name;
		this.numOfApple = numOfApple;
		this.balance = balance;
	}
	int sale(int money) {
		int num = money/PRICE;
		if(num>numOfApple) {
			System.out.println("다 팔림");				
			num=0;
			}
		else {
		numOfApple -= num;
		balance += money;			
		System.out.println(name+"      판매"+num+"개, 수입 : "+money);
		}
		return num;
	}
	void print() {
		System.out.println("");
		System.out.println("");
	}
}
