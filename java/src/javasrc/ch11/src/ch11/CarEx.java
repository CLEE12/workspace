package ch11;

import java.util.ArrayList;

public class CarEx {
	public static void main(String[] args) {
		ArrayList<Car> al1 = new ArrayList<>(); //Elements를 Car로 지정.
		al1.add(new Bus());
		al1.add(new Taxi());
		//al1.add(new Ambulance()); // 상속을 못받아서 안됨.
		for(Car car : al1) {
			car.print();
			if(car instanceof Bus) {
				((Bus) car).move();
			}
		}
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(new Bus());
		al2.add(new Taxi());
		al2.add(new Ambulance());
		for(int i=0; i<al2.size(); i++) {
			Car c1 = (Car)al2.get(i);
			c1.print();
			((Car)al2.get(i)).print();
		}
	}

}
