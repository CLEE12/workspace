package ch03;
public class If9a {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String str = "������";
		if (month >= 1 && month <= 12) {
	    if (month == 12 || month == 1 || month ==2) str = "�ܿ�";
	    else if (month == 3 || month == 4 || month == 5) str = "��";
		else if (month == 6 || month == 7 || month == 8) str = "����";
		else str = "����";}
	    
	    System.out.print(str+"�Դϴ�.");
		}
	}
