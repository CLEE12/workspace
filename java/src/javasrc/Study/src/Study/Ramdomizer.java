package Study;

import java.util.HashSet;

public class Ramdomizer {
	
	public static void main(String[] args) {
		String[] name = {"�赵��","�����","������","������","������","�ӽ¿�","������",
				"������","������","����ȣ","������","���ʱ�","��پ�","�̴ټ�","�����",
				"���缳","�ڿ���","������","������","�±���","�̼���","�ڰ���","��âȣ",
				"�̼���","������","������","���¿�","������","������","������"};
		HashSet<String> hs = new HashSet<>();
		while(hs.size() < 3) {
			int num = (int)(Math.random()*29);
			hs.add(name[num]);
		}
		System.out.println(hs);
		
	}
}
