package ch06;

public class CardEx {
	public static void main(String[] args) {
		CardDeck cdk = new CardDeck();
		for(int i=0; i<cdk.cd.length; i++) {
			System.out.println(cdk.cd[i]);
		}
	}
}
