package ch06;
class Player1_1 {
	String team, name;
	int phy, sht, agl, pss, def;
	Player1_1() {} // 생성자가 하나도 없을때만 자동으로 만들어 줌.
	Player1_1(String t, String n, int p, int s, int a, int ps, int d) {
		team = t;
		name = n;
		phy  = p;
		sht  = s;
		agl  = a;
		pss  = ps;
		def  = d;
	}
    int getTotal() {
    	return phy + sht + agl + pss + def;
    }
}

public class Student1 {
	public static void main(String[] args) {
		Player1_1 st1 = new Player1_1("Real Madrid","Ronaldo",7,9,7,8,5);
		System.out.println(st1.name+"("+st1.team+") ttl score: "+st1.getTotal());
		System.out.println(st1.name+"("+st1.team+") avg score: "+st1.getTotal()/5);

	}
}
