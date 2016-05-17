package ch08;

public class FinalTest { //final을 class앞에 쓰게 되면 상속자에 FinalTest가 애러.
	int a = 7;
	void print() {
		System.out.println("대박");
	}
    void print2() {
    	System.out.println("사건");
    }
	public static void main(String[] args) {
		FinalTest2 ft = new FinalTest2();
		ft.print();
		ft.print2();
		FinalTest ft2 = new FinalTest();
		ft2.print();
	}
	}
class FinalTest2 extends FinalTest { //pubilc class 에 final이 있는데 의미는 상속이 안되서 그럼.
    void print() {
    	System.out.println("야호 1시간 남았다");
    }
    //void print2() { } //Overriding(재정의) 할 수 없다.
    }