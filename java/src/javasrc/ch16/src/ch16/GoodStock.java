package ch16;
import java.io.Serializable;
public class GoodStock implements Serializable{
	String code;
	transient int num;
	GoodStock(String code,int num) {
		this.code = code;   this.num = num;
	}
	void addStock(int num) {
		this.num+=num;
	}
	int minusStock(int num) {
		if (this.num < num) {
			System.out.println("������ �����Ͽ� ������� ���մϴ�");
			return 0;
		} else {	this.num-=num;		return num;		}		
	}
}