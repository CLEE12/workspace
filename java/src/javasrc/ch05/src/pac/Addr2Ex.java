package pac;
//import: 다른 패키지에 있는 클래스를 사용하겠다는 것.
import ch05.Car;

public class Addr2Ex {
	public static void main(String[] args) {
		//ch05.AdderEx a1 = new ch05.AdderEx();
		//ch05.Adder가 public이 아니여서 사용 불가.
		ch05.Car c1 = new ch05.Car();
		Car c2      = new Car();
		c1.name     = "소나타";
		c1.speedUp(100);
	}
//ch05.Car에 있는 public 변수와 메소드를 가져와서 사용 함.
}
