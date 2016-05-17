package ch07;

public class Car2Ex {
	public static void main(String[] args) {
		Car2 c1 = new Ambulance(); //부모를 선언하고 자식을 대입하는 up casting은 아무 문제 없다.
		Car2 c2 = new FireEngine(); 
		//Ambulance a1 = new Car2(); 자식을 선언하고 부모를 대입하는 down casting은 안된다.
		//Ambulance ab1 = (Ambulance)new Car2(); //이렇게 강제로 down casting은 애러는 안나지만 
		Ambulance ab2 = (Ambulance)c1;        //실행할때 애러가 발생한다.
		//Ambulance ab3 = (Ambulance)c2();
		Car2 c3 = new Car2();
		Ambulance ab4 = new Ambulance();
		//Ambulance ab5 = (Ambulance)new FireEngine(); //상속만 가능
		
		c1.move();//부모선언. 자식대입 //자식대입 -> 자식메소드
		c3.move();//부모선언. 부모대입 //부모대입 -> 부모메소드
		ab4.move(); //자식선언. 자식대입 //자식대입 -> 자식 메소드
		System.out.println("k = "+c1.k);
		System.out.println("k = "+c3.k);
		System.out.println("k = "+ab4.k);
		System.out.println("=================");
		ab4.siren(); //자식선언 자식대입 -> 자식메소드 전체 실행 가능.
		//부모선언 자식대입 -> 부모에 있는 메소드와 같은 이름만 실행 가능.
		//c1.siren();
		ab2.siren(); //부모를 자식에 대입할 때는 자식 전체 메소드 사용가능.
	}

}
