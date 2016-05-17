package ch07;

public class Car2Ex2 {
	public static void main(String[] args) {
		Car2[] car = new Car2[2];
		car[0] = new Ambulance();
		car[1] = new FireEngine();
		
		for(Car2 c : car) {
			c.move();
			if(c instanceof Ambulance) { 
				/*Ambulance a1 = (Ambulance) c;
				a1.siren();*/
				((Ambulance) c).siren();
			}
		}
		System.out.println("=======================");
		for(int i=0; i<car.length; i++) {
			car[i].move();
			if(car[i] instanceof Ambulance) {
				((Ambulance)car[i]).siren();
			}
		}
	}
}
