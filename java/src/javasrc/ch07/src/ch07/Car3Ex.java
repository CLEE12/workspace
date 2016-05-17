package ch07;

public class Car3Ex {
	public static void main(String[] args) {
	Car3[] car = new Car3[5];
	car[0] = new Bus("Å¸¿ä¹ö½º","½Â°´",40);
	car[1] = new Bus("°í¼Ó¹ö½º","½Â°´",30);
	car[2] = new Taxi("ÀÏ¹ÝÅÃ½Ã","°í°´",70);
	car[3] = new Taxi("¸ð¹üÅÃ½Ã","°í°´",90);
	car[4] = new Ambulance2("ÀÀ±ÞÂ÷","È¯ÀÚ","»ß»Ç»ß»Ç");
	
	for(int i=0; i<car.length; i++) {
		car[i].move();
		if(car[i] instanceof Ambulance2) {
			//((Ambulance2)car[i]).siren();
			Ambulance2 am = (Ambulance2)car[i];
			am.siren();
		}
	}
}
}
