package ch05;

class Adder {
	int x, y;
	void add() {
		System.out.println("두수의 합: "+(x+y));
	}

}

class AdderEx { 
	//클래스를 합칠경우 add와 AdderEx의 클래스명은 같아야 한다.
	public static void main(String[] args) {
		Adder a1 = new Adder();
		a1.x = 15;
		a1.y = 20;
		a1.add();
	}
}