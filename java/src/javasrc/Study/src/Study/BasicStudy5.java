package Study;

public class BasicStudy5 {
	public static void main(String[] args) {
		int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
		}
	}

}


/*
1. �Ϻ��� �ʱ��� ���.
2. 1������ 5���� ���
3. 1������ 2�� ����� ���
4. 1������ 2�� 3�� ����� ���� ���
5. ���߹迭 ���ڴ� Ʈ���̴� ��� ���� ��� 
6. ���ڹ迭 7,8������ ũ�� �� ���.
7. �ζ� ���� Ǯ���. 

7���� ���ذ� �� �ȵȴٸ� , 6���� ���� ������ ���ɼ��� ����. 6�� ���ַ� �� ��.
*/


