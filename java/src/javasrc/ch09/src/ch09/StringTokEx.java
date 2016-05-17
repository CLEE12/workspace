package ch09;

import java.util.StringTokenizer;

public class StringTokEx {
	public static void main(String[] args) {
		StringTokenizer st = 
				new StringTokenizer("Rabsberry.Blueberry,Blackberry.Strawberry",".,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
