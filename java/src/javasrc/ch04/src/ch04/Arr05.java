package ch04;

public class Arr05 {
	public static void main(String[] args) {
		//char ch;  ����
		//char[] ch;  ���ڹ�� ch�̸����� ���� (java���� ���ڴ� �����ڵ�(2byte))
	    char[] ch; //save to stack
	    ch = new char[4]; //char(unicode) 4���� ����Ȯ�� heap
	    ch[0] = 'j';
	    ch[1] = 'a';
	    ch[2] = 'v';
	    ch[3] = 'a';
	    for(char c : ch) {
	    	System.out.print(c);
	    }
	}

}
