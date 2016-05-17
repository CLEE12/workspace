package ch07;
public class Fruit4 {
	public static void main(String[] args) {
		FruitSeller4 fs1 = new FruitSeller4("IU", 30,1000);
		FruitSeller4 fs2 = new FruitSeller4("수지  ", 10,10000);
		
		FruitBuyer4 fb1 = new FruitBuyer4("정우성",200000);
		FruitBuyer4 fb2 = new FruitBuyer4("이효리", 5000);
		
		fb1.buy(fs1,5000);
		fb2.buy(fs2,7000);
		fb1.buy(fs2,7000);
		fb2.buy(fs1,4000);
	}
}
