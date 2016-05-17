package ch07;

public class FruitSeller3 {
	String name;
	int numofApple = 20;
	int balance = 0;
	final int PRICE = 1000;
	
	public FruitSeller3(String name) {
		this.name = name;
	}
		
		int sale(int money) {
			int num = money/PRICE;
			if(num>numofApple) {
				System.out.println("재고물량 : 0");
				num=0;
			}
			else {
			numofApple -= num;
			balance += money;
			System.out.println(name+"  판매"+num+"개, 수입 : "+money);
			print();
			}
			return num;
		}   
		void print() {
			System.out.println("            물량 : "+numofApple);
			System.out.println("            잔고 : "+balance);
			System.out.println("=======================");
	}

}
