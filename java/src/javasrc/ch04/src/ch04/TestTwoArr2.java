
package ch04;

public class TestTwoArr2 {
	public static void main(String[] args) {

		int tot=0, sum=0;
		String[] title ={"1월","2월","3월","4월","5월","합계", "평균"};
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
		System.out.println("\n총합계 : "+tot);
	}
}

/*확장for문 방법: (19번째 줄부터)
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
System.out.println("\n총합계 : "+sum);
*/