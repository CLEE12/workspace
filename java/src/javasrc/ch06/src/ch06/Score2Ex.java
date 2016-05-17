package ch06;
class Score2 {
	String name; int[] score; int tot;
	Score2(String name, int score[]) {
		this.name = name;
		this.score = score;
	}
	void tot(){
		for(int i=0; i<score.length; i++) {
			tot += score[i];
		}
	}
	void print() {
		tot(); //ºÒ·¯Áà¾ß ÇÔ.
		System.out.println(name+" ÃÑÁ¡ : "+tot);
		System.out.println(name+" Æò±Õ : "+tot/score.length);
	}
}
public class Score2Ex {
	public static void main(String[] args) {
		int[] sc1 = {43,65,87};
		int[] sc2 = {43,76,87,67,89};
		Score2 s1 = new Score2("º¸¶ó", sc1);
		Score2 s2 = new Score2("µ¹ÀÌ", sc2);
		s1.print();
		s2.print();
	}

}
