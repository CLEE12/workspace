package ch05;
class score {
	//��������� ���� ū �����̰� �� �ȿ� instance����, class ���������� ������.
	int kor, eng, math;
	String man; 
	//string�� void�ȿ� ������ ������ �ȵ�.
	void print(){
		int sum = kor + eng + math; //���� ����
		System.out.println(man+"�� ���� : "+sum);
		System.out.println(man+"�� ��� : "+sum/3);
	} //���� ���Ե� ��� ������ class. �����
}

public class ScoreEx {
	public static void main(String[] args) {
		score s1 = new score();
		s1.kor =70;
		s1.eng =99;
		s1.math=88;
		score s2 = new score();
		s2.kor =90;
		s2.eng =80;
		s2.math=95;
		s1.man = "�ʶ���";
		s2.man = "������";
		s1.print();
		s2.print();
	}

}
