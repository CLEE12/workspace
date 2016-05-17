package ch02;

public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 167;
		int sizeOfBucket = 10;
		int numOfBucket = 
				numOfApples % sizeOfBucket == 0 ?  // 조건: 나머지가 0이 아니면
				numOfApples / sizeOfBucket :       // 선택: true면 이걸로 가고
			    numOfApples / sizeOfBucket +1;     // 선택: false면 이걸로 감.
		
		System.out.println("Required to use number of buckets : "+numOfBucket);
		
	}

}
