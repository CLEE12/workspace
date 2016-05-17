package ch19;
interface MyFunction2Inter {
	void method(int x);
	
}

public class MyFunction2Ex {
	public static void main(String[] args) {
		MyFunction2Inter mi = (x)-> {System.out.println("x = "+x);};
		mi.method(7);
		
		mi=(x)-> System.out.println("x = "+x);
		mi.method(34);
		
		mi=x-> System.out.println("x = "+x); //매개변수 x가 있는경우 ()를 지워도 됨. 없는경우 ()를 남겨야 함.
		mi.method(54);
		}
	}
