package ch06;
public class ScEx {
	public static void main(String[] args) {
		String[] title = {"�̸�","����","����","����","����","����","���"};
		int[][] score={{90,80,70,87},{76,86,90,98},{90,78,90,56},
				{80,80,80,87},{85,98,88,78}};
		String[] name = {"������","�����","ȿ��","�̽±�","����"};
		String subject = "����ǥ";
		int cnt = 52;
		ScoreCal sc = 
			new ScoreCal(subject, title, score, name, cnt);
		sc.print();				
	}
}