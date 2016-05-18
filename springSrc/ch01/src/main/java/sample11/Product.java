package sample11;
public class Product {
	private String name;
	private String price;
	Product(String name,String price) {
		this.name = name;   this.price=price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String toString() {
		return "제품[이름="+name+", 가격="+price+"]";
	}
}