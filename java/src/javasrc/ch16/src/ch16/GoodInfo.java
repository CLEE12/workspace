package ch16;
import java.io.Serializable;
public class GoodInfo { // implements Serializable {
	String code;
	String name;
	int price;
	
	GoodInfo() {}
	GoodInfo(String code,String name,int price) {
		this.code  = code;
		this.name  = name;
		this.price = price;
	}
}