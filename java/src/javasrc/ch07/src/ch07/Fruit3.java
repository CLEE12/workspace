package ch07;

public class Fruit3 {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("��������ȸ");
		FruitSeller3 fs2 = new FruitSeller3("�������ȸ");
		FruitBuyer3 fb1 = new FruitBuyer3("���缮");
		FruitBuyer3 fb2 = new FruitBuyer3("�ڸ��");
		FruitBuyer3 fb3 = new FruitBuyer3("����  ");
		
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
