package ch04;

public class Args2 {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("���� �����ȣ ���� �������� �Է�");
			System.exit(0); //���α׷� ����
		}
		int num1 = Integer.parseInt(args[0]);
		String op = args[1];
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		switch(op) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "x" : result = num1 * num2; break;
		case "/" : result = num1 / num2; break;
		default  : System.out.println("Invalid digits");
		}
		System.out.printf("%d %s %d = %s",num1,op,num2,result);
	}

}