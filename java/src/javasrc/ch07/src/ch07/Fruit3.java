package ch07;

public class Fruit3 {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("아이유상회");
		FruitSeller3 fs2 = new FruitSeller3("배수지상회");
		FruitBuyer3 fb1 = new FruitBuyer3("유재석");
		FruitBuyer3 fb2 = new FruitBuyer3("박명수");
		FruitBuyer3 fb3 = new FruitBuyer3("하하  ");
		
		//System.out.println("================");
		
		fb1.buy(fs1,3000);
		fb2.buy(fs2,2000);		
		fb1.buy(fs2, 2000);
		fb3.buy(fs1, 5000);
		fb1.buy(fs1,5000);
		fb3.buy(fs1,5000);
		fb1.buy(fs1,6000);
		fb1.buy(fs2,3000);
		
		/*fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
		fb3.print();
		fs1.print();
		fs2.print();
		*/
		//System.out.println("================");
	}

}
