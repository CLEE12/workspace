package ch08;

interface C1 { //interface에서는 ;이 일반적으로 사용 됨.
	void print();
	public abstract void cal(); //interface는 public abstract가 생략된것. 사용안해도 같은 용도로 사용 가능.
}
class C2 implements C1 {
	public void print() {
	    System.out.println("날씨가 춥네");
	}
	public void cal() {
		System.out.println("점심시간까지 얼마나 남았지?");
	} //interface는 extends대신 implements를 사용한다.
	
}
public class Inter01 {
	public static void main(String[] args) {
		C1 c1 = new C2();
		c1.print();
		c1.cal();
	}
}
