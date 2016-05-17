package ch04;

public class ArrCopy1 {
	public static void main(String[] args) {
		int[]a1 = {4,7,8,9,5};
	    int[]a2 = new int[10];
	    int[]a3 = new int[10];
	    int[]a4 = new int[10];
	    int[]a5 = new int[10];
	    for(int i=0; i<a1.length; i++) {
	    	a2[i]=a1[i];
	    }
	    for(int i=0; i<a2.length; i++) {
	    	System.out.print(a2[i]+"\t");
	    }System.out.println();
	    // 원본 시작 목표 시작 객수
	    System.arraycopy(a1, 0, a3, 0, a1.length);
	    for(int i=0; i<a3.length; i++) {
	    	System.out.print(a3[i]+"\t");
	    }System.out.println();
	    
	    System.arraycopy(a1, 0, a4, 1, a1.length-2);
	    for(int i=0; i<a4.length; i++) {
	    	System.out.print(a4[i]+"\t");
	    }System.out.println();
	    
	    System.arraycopy(a1, 1, a5, 0, a1.length-1);
	    for(int i=0; i<a5.length; i++) {
	    	System.out.print(a5[i]+"\t");
	    }System.out.println();
	}

}
