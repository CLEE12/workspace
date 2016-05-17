package ch05;

class Tv {
	String color;
	boolean power;
	int channel;
	String brand;
	
	Tv(String c, boolean p, int ch, String br) {
		color = c; //초기화 작업.
		power = p;
		channel = ch;
		brand = br;
	}
	void print() {
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color); //초기화와 상관없이 color를 다 입력해 줘야 함.
		if(power) System.out.println("Status : On");
		else System.out.println("Status : Off"); //else는 조건을 쓸 필요 없다.
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