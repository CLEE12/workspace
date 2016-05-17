package ch05;

public class Car3Ex {
	public static void main(String[] args) {
		Car3.color = "빨강"; 
		//밑에 c1.color를 쓰거나 이걸 쓰거나 상관없다. 
		//어차피 static으로 공유하기 때문에.
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		
		c1.name  = "벤츠";
		//c1.color = "노랑";
		//c2.color = "초록"; 
		//static을 쓰면 c1, c2 상관없이 다 같이 변경 된다.
		c2.name  = "아우디";
		c1.print();
		c2.print();
	}

}
