package ch06;
class Score {
	String name;
	int kor, eng, math;
	Score(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	}
	int tot() {
		return kor + eng + math;
	}
	void print() {
		int total = tot();
		System.out.println(name+"�� ���� : "+total);
		System.out.println("       ��� : "+total/3);
		for(int i=0; i<13; i++) {
		System.out.print("=");
		}
		System.out.println();
	}
}
public class ScoreEx {
	public static void main(String[] args) {
		Score s1 = new Score("����", 43, 65, 87);
		Score s2 = new Score("ȿ��", 43, 76, 87);
		Score s3 = new Score("����", 76, 98, 76);
		s1.print();
		s2.print();
		s3.print();
	}

}
