package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(15, 20);
		
		Outer.Inner i1 = out.getInner();
		System.out.println("Volume : "+i1.volume());
		
		Outer.Inner i2 = out.new Inner();
		System.out.println("Volume : "+i2.volume());
	}

}
