package ch07;

public class FruitBuyer4 {
		String name;
		int numOfApple = 0;
		int balance = 10000;
		public FruitBuyer4(String name, int balance) {
			this.name=name; this.balance = balance;
		}
		void buy(FruitSeller4 seller, int money) {
			if(money > balance) {
				System.out.println("show me the money");
			}
			else {
			int num = seller.sale(money); 
			if (num !=0) {
			numOfApple+=num;
			balance -= money;
			System.out.println(name+"      구입"+num+"개, 지출 : "+money);
			}
			}
		}
		void print() {
			System.out.print(name+" 과일 : "+numOfApple);
			System.out.println("       잔고 : "+balance);
			System.out.println("=======================");
		}
		
	}

