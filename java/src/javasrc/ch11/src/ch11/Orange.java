package ch11;

public class Orange {
	int sugar;
	Orange(int sugar) {
		this.sugar = sugar;
	}
	void print() {
		System.out.println("당도 : "+sugar);
	}
}
class Apple {
	int weight;
	Apple(int weight) {
		this.weight = weight;
	}
	void print() {
		System.out.println("무게 : "+weight+"그램");
	}
}