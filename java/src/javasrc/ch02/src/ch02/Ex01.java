package ch02;

public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 167;
		int sizeOfBucket = 10;
		int numOfBucket = 
				numOfApples % sizeOfBucket == 0 ?  // ����: �������� 0�� �ƴϸ�
				numOfApples / sizeOfBucket :       // ����: true�� �̰ɷ� ����
			    numOfApples / sizeOfBucket +1;     // ����: false�� �̰ɷ� ��.
		
		System.out.println("Required to use number of buckets : "+numOfBucket);
		
	}

}
