package ch06;
public class ScoreCal {
	
	int sum;
	int cnt; 
	int[] tot;
	int[][] score; 
	String  subject;
	String[] title;
	String[] name;
	
	ScoreCal(String  subject,String[] title,int[][] score, String[] name, int cnt) {
		this.subject = subject; 
		this.title = title;
		this.score = score; 	
		this.name = name; 
		this.cnt=cnt;			
		tot = new int[score[0].length];
	}
	public void print() {
		System.out.println(subject+"\n");
		for (String tit : title) {	
			System.out.print(tit+"\t");
		}
		System.out.println();
		for(int i =0;i<cnt;i++) {	
			System.out.print("=");	
		}
		System.out.println();
		for(int i =0; i <score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j <score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j]; 
				tot[j]+= score[i][j];
			}
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0;
		}
		for(int i =0;i<cnt;i++) {	
			System.out.print("=");
		}
		System.out.print("\nÃÑ°è\t");
		for(int j=0;j < tot.length;j++) {
			System.out.print(tot[j]+"\t");
			sum += tot[j];
		}
		System.out.println(sum+"\t"+sum/tot.length);
		System.out.print("Æò±Õ\t");
		for(int j=0;j < tot.length;j++) {
			System.out.print(tot[j]/name.length+"\t");
		}
		System.out.println(sum/name.length+"\t"+
			(float)sum/tot.length/name.length);
	}
}