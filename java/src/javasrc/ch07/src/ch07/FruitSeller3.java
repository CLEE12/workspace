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
				System.out.println("����� : 0");
				num=0;
			}
			else {
			numofApple -= num;
			balance += money;
			System.out.println(name+"  �Ǹ�"+num+"��, ���� : "+money);
			print();
			}
			return num;
		}   
		void print() {
			System.out.println("            ���� : "+numofApple);
			System.out.println("            �ܰ� : "+balance);
			System.out.println("=======================");
	}

}
