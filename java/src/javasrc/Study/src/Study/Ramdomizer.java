package Study;

import java.util.HashSet;

public class Ramdomizer {
	
	public static void main(String[] args) {
		String[] name = {"김도윤","김민준","강지수","김종완","장혁수","임승연","강진우",
				"신태진","이진경","유은호","유태하","최필규","김다애","이다솜","김민주",
				"이재설","박영광","구동진","이지연","승기형","이석훈","박건유","이창호",
				"이선우","이재정","곽지은","정태원","강현수","박태진","구렁이"};
		HashSet<String> hs = new HashSet<>();
		while(hs.size() < 3) {
			int num = (int)(Math.random()*29);
			hs.add(name[num]);
		}
		System.out.println(hs);
		
	}
}
