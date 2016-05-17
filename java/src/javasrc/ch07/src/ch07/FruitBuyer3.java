package ch07;

public class FruitBuyer3 {
		String name;
		public FruitBuyer3(String name) {
			this.name=name;
		}
		int numofApple = 0; int balance = 10000;
		void buy(FruitSeller3 seller, int money) {
			if(money > balance) {
				System.out.println("show me the money");
			}
			else {
			int num = seller.sale(money); 
			if (num !=0) {
			numofApple+=num;
			balance -= money;
			System.out.println(name+"      구입"+num+"개, 지출 : "+money);
			}
			}
		}
		void print() {
			System.out.print(name+" 과일 : "+numofApple);
			System.out.println("       잔고 : "+balance);
			System.out.println("=======================");
		}
		
	}

