package ch05;

class Tv {
	String color;
	boolean power;
	int channel;
	String brand;
	
	Tv(String c, boolean p, int ch, String br) {
		color = c; //�ʱ�ȭ �۾�.
		power = p;
		channel = ch;
		brand = br;
	}
	void print() {
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color); //�ʱ�ȭ�� ������� color�� �� �Է��� ��� ��.
		if(power) System.out.println("Status : On");
		else System.out.println("Status : Off"); //else�� ������ �� �ʿ� ����.
		System.out.println("Channel : "+channel);
		System.out.println("---------------");
    }
}
public class TvEx { 
    public static void main(String[] args) {
		Tv t1 = new Tv ("Red",false,3,"Samsung");
		Tv t2 = new Tv ("Black",true,7,"LG");
		Tv t3 = new Tv ("White",true,15,"Shaomi");
		t1.print();
		t2.print();
		t3.print();
	}
}