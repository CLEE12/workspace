package ch07;

public class Car3Ex {
	public static void main(String[] args) {
	Car3[] car = new Car3[5];
	car[0] = new Bus("Ÿ�����","�°�",40);
	car[1] = new Bus("��ӹ���","�°�",30);
	car[2] = new Taxi("�Ϲ��ý�","��",70);
	car[3] = new Taxi("����ý�","��",90);
	car[4] = new Ambulance2("������","ȯ��","�߻ǻ߻�");
	
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
