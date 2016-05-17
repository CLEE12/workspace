package ch10;

public class Ex01 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*10);
			try {
				System.out.println("³ª´°¼À : "+10/x);
		    }
			catch(ArithmeticException e) {
				System.out.println("0À¸·Î ¸ø³ª´²");
				System.out.println(e.getMessage());
     	}

    }
}
}
