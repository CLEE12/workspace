package ch08;

public class ParentEx {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.p1();
		
		Parent p2 = new Child();
		p2.p1();
		
		Child c1 = new Child();
		c1.p1();
	}

}
