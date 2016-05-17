package ch04;

public class Arr05 {
	public static void main(String[] args) {
		//char ch;  선언
		//char[] ch;  문자배월 ch이름으로 선언 (java에서 문자는 유니코드(2byte))
	    char[] ch; //save to stack
	    ch = new char[4]; //char(unicode) 4개의 공간확보 heap
	    ch[0] = 'j';
	    ch[1] = 'a';
	    ch[2] = 'v';
	    ch[3] = 'a';
	    for(char c : ch) {
	    	System.out.print(c);
	    }
	}

}
