package Study;

import java.util.HashSet;

public class Test1 {
   public static void main(String[] args) {
	String[] str={"�赵��","�����","������","������","������","�ӽ¿�","������",
			"������","������","����ȣ","������","���ʱ�","�����","�̴ټ�","�����"
			,"���缳","�ڿ���", "������","������","�±�����",
			 "�̼���","��","��âȣ","�̼���","������","������","���¿�","������","������"};
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