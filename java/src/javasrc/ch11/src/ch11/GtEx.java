package ch11;

public class GtEx {
	public static void main(String[] args) {
		GenericEx1<String> g1 = new GenericEx1<>();
		GenericEx1<Integer> g2 = new GenericEx1<>();
		GenericEx1 g3 = new GenericEx1<>();
		
		String[] str = {"Live","in da","future"};
		g1.set(str);
		g1.print();
		//g2.set(str);
		
		System.out.println();
		
		Integer[] i1 = {12,45,56};
		g2.set(i1); 
		g2.print();
	}
}
