package ch04;

public class Product1 {
	public static void main(String[] args) {
		int sum = 0; int[] tot = new int[4];
		String[] month = {"��ǰ��","1��","2��","3��","4��","�հ�","���"};
		int[][] income = {{250,170,300,780},
				          {170,120,150,220},
				          {450,230,400,250}};
		String[] product = {"�����","Ƽ��","û�ұ�"};
		
		System.out.println("������Ȳ (����: ����)\n");
		
		for(String m : month) {
			System.out.print(m+"\t");
		}
		System.out.println();
		
		for(int i=0; i<51; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=0; i<income.length; i++) {
			System.out.print(product[i]+"\t");
			for(int j=0; j<income[i].length; j++) {
				System.out.print(income[i][j]+"\t");
				sum += income[i][j]; 
				tot[j] += income[i][j];
			   }	
			  System.out.println(sum+"\t"+sum/income[i].length);
			   sum = 0;
		}
		for(int i=0; i<51; i++) {
		    System.out.print("=");
    	   }
		System.out.print("\n�Ѱ�\t");
    	for(int j=0; j<tot.length; j++) {
    		System.out.print(tot[j]+"\t");
    	   	sum += tot[j];
    	   }
    	System.out.println(sum+"\t"+sum/tot.length);
        
    	/*System.out.print("���\t");
    	for(int j=0; j<tot.length; j++) {
    		System.out.print(tot[j]/product.length+"\t");
    	   }
    	 *
    	 * System.out.println(sum/product.length+"\t"+
    	                      sum/tot.length/product.length);*/
	}
}
