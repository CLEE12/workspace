package ch03;

public class Sw1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch(num) {
		//break�� ���� �۾� �Ŀ� switch���� �����.
		case 1 : System.out.print("L"); break;
		case 2 : System.out.print("O"); break;
		case 3 : System.out.print("V"); break;
		case 4 : System.out.println("E"); break;
		default : System.out.println("�㰢");
		}
	}
}
