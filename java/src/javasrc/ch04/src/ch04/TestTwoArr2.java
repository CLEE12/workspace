
package ch04;

public class TestTwoArr2 {
	public static void main(String[] args) {

		int tot=0, sum=0;
		String[] title ={"1��","2��","3��","4��","5��","�հ�", "���"};
		int[][] arr = {{5,5,5,5,5},{10,10,10,10,10},
				       {20,20,20,20,20},
				       {30,30,30,30,30}};
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
	    }
		System.out.println();
		for(int i=0; i<55; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
				tot+=arr[i][j];
				System.out.print(arr[i][j]+"\t");
		}
			System.out.println(sum+"\t"+sum/arr[i].length);
			sum=0;
	}
		System.out.println("\n���հ� : "+tot);
	}
}

/*Ȯ��for�� ���: (19��° �ٺ���)
System.out.println();
for(int[] ar : arr) {
	for(int a : ar) {
		sum+=s;
		hsum+=s;
		System.out.print(s+"\t");
}
	System.out.println(hsum);
	hsum=0;
}
System.out.println("\n���հ� : "+sum);
*/