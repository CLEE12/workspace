package ch06;

public class CardDeck {
	Card[] cd = new Card[20];
	CardDeck() {
		for(int i=0; i<20; i++) {
			int num = i%10+1;
			boolean isKwang = 
					i<10 && (num==1 || num==3 || num==8) ?
							true : false;
			cd[i]= new Card(num,isKwang);
		}
	}
			

}


/*final int CARD_NUM = 20; //final�� �������� �ʰڴٴ� ��.
Card[] cards = new Card[CARD_NUM];

Card() { 
	for(int i-0; i<cards.length; i++) {
		int num = i
	}
}
 _______
|      |\
| 1    ||
|    ��  ||
|______||
 \=====\|

*/
