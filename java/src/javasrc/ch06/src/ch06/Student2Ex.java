package ch06;
class Player2_1 {
	String team, name;
	int phy, sht, agl, pss, def;
	Player2_1() {} // 생성자가 하나도 없을때만 자동으로 만들어 줌.
	Player2_1(String t, String n, int p, 
			  int s, int a, int ps, int d) {
		team = t;	name = n;
		phy  = p;	sht  = s;	agl  = a;
		pss  = ps;
		def  = d;
	}
    int getTotal() {
    	return phy + sht + agl + pss + def;
    }
    void print() {
    	int total = getTotal();
    	System.out.println(name+"("+team+") ttl score : "+total);
    	System.out.println("                     avg score : "+total/5);
    }
}

public class Student2Ex {
	public static void main(String[] args) {
		Player2_1 st1 = new Player2_1("Real Madrid","Ronaldo",7,9,7,8,5);
		Player2_1 st2 = new Player2_1("Real Madrid","James  ",6,6,8,9,6);
		Player2_1 st3 = new Player2_1("Real Madrid","Bale   ",9,7,6,7,7);
		Player2_1 st4 = new Player2_1("Real Madrid","Pepe   ",10,5,8,7,10);
		st1.print();
		st2.print();
		st3.print();
		st4.print();
	}
}
 /*           /\
             //\\
            ///\\\
           ////\\\\
          /////\\\\\
         /////  \\\\\
         \\\\\__/////
          \\\\__////
           \\\__///
            \\__//
             \__/
*/



