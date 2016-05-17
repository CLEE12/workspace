package ch07;

public class CarEx {
	public static void main(String[] args) {
		String manuf1 = new String("Aston Martin"); 
		String model1 = new String("Vulcan 2015");
		Engine eg1 = new Engine("Petrol V12",800);
		
		String manuf2 = new String("Lamborghni"); 
		String model2 = new String("Uracan");
		Engine eg2 = new Engine("Petrol V10",610);
		
		String manuf3 = new String("Mclaren"); 
		String model3 = new String("675LT");
		Engine eg3 = new Engine("Petrol V8",675);
		
		Car c1 = new Car(manuf1, model1,eg1);
		Car c2 = new Car(manuf2, model2,eg2);
		Car c3 = new Car(manuf3, model3,eg3);
		
		c1.print();
		c2.print();
		c3.print();
		System.out.println("--------------------------");
		
		/* Car[] car = new Car[3];
		 * Car[0] = c1; car[1] = c2; car[2] = c3;
		 * for(Car c : car) {
		 *	 c.print();
		 *}
	     */
		
	}

}
