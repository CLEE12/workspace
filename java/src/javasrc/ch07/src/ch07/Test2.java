package ch07;
class Parent {
	int x = 100;
	Parent() {	
		this(200);
		System.out.println("2번");
	}       
	Parent(int x) {	
		this.x = x;	
		System.out.println("1번 x = "+x );
	}   
	int getX() {	return x;	}
}
class Child extends Parent {
	int x = 3000;
	Child() {	
		this(1000);
		System.out.println("4번");
	}    
	Child(int x) {	
		this.x = x;	
		System.out.println("3번 x = "+x);
	} 
}
public class Test2 {
	public static void main(String[] args) {
		Child c = new Child(); 
		System.out.println("x = " + c.getX()); 
	}
}