package ch05;

public class CarEx {
	public static void main(String[] args) {
	//클래스명 레퍼런스명 (객체명)	
		Car myCar; //객체 선언
		myCar = new Car(); //객체 생성
		Car yourCar = new Car(); // 선언과 생성을 동시
		//객체에 접근하는 방법: 레퍼런스변수명+.+변수명(메소드명)
		myCar.name = "소나타";
		myCar.color = "빨강";
		yourCar.name = "말두타";
		yourCar.color = "노랑";
		//yourCar.color = "똥색";
		System.out.println("이름: "+myCar.name);
		System.out.println("색상: "+myCar.color);
		System.out.println("속도: "+myCar.speed);
		System.out.println("\n이름: "+yourCar.name);
		System.out.println("색상: "+yourCar.color);
		System.out.println("속도: "+yourCar.speed);
		//지역변수, 메소드 안에서 정의한 변수
		//지역변수는 초기화 해야 사용할 수 있다.
		
		String s1 = "";
		System.out.println("\n문자 :"+s1);
	}

}
