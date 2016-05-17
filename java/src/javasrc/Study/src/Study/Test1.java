package Study;

import java.util.HashSet;

public class Test1 {
   public static void main(String[] args) {
	String[] str={"김도윤","김민준","강지수","김종완","장혁수","임승연","강진우",
			"신태진","이진경","유은호","유태하","최필규","김다혜","이다솜","김민주"
			,"이재설","박영광", "구동진","이지연","승기형님",
			 "이석훈","나","이창호","이선우","이재정","곽지은","정태원","강현수","박태진"};
	HashSet<String> hs1=new HashSet<>();
	
	for(int i=0;i<10;i++){
		for(int c=0;c<3;c++){
		    int j=(int)(Math.random()*29);
		    
		    if(hs1.contains(str[j])){
		    	c--;
		    	continue;
		    }
		    else {
		    	hs1.add(str[j]);
		    	System.out.print(str[j]+"\t");
		    }
	        }System.out.println();
	}
   }
}

		//System.out.print(str[j]+"\t"); hs1.contains(str[j]);