package ch05;
class score {
	//멤버변수가 가장 큰 범위이고 그 안에 instance변수, class 변수등으로 나눠짐.
	int kor, eng, math;
	String man; 
	//string이 void안에 있으면 실행이 안됨.
	void print(){
		int sum = kor + eng + math; //지역 변수
		System.out.println(man+"의 총점 : "+sum);
		System.out.println(man+"의 평균 : "+sum/3);
	} //위에 포함된 모든 문구가 class. 설계사
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
		s1.man = "똘똘이";
		s2.man = "돌돌이";
		s1.print();
		s2.print();
	}

}
