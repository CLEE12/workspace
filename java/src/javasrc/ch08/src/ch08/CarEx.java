package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Bus();
		car[1] = new Texi();
		car[2] = new Ambulance();
		
		for(Car c : car) {
			c.move();
		}
	}

}
