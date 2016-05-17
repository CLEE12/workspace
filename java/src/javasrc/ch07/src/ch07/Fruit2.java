package ch07;

public class Fruit2 {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("아이유 상회");
		FruitSeller2 fs2 = new FruitSeller2("배수지 상회");
		FruitBuyer2 fb1 = new FruitBuyer2("유재석");
		FruitBuyer2 fb2 = new FruitBuyer2("박명수");
		FruitBuyer2 fb3 = new FruitBuyer2("하하  ");
		
		System.out.println("================");
		
		fb1.buy(fs1,3000);
		fb2.buy(fs2,2000);
		fs1.print();
		fs2.print();
		
		System.out.println("================");
		
		fb1.buy(fs2, 2000);
		fb3.buy(fs1, 5000);
		fb1.print();
		fb2.print();
		fb3.print();
		fs1.print();
		fs2.print();
		
		System.out.println("================");
	}

}
