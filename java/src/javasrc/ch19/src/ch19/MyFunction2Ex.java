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
		
		mi=x-> System.out.println("x = "+x); //�Ű����� x�� �ִ°�� ()�� ������ ��. ���°�� ()�� ���ܾ� ��.
		mi.method(54);
		}
	}
