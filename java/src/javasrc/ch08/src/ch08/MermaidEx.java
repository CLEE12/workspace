package ch08;
class Person {
	void move() {
		System.out.println("두 다리로 걷는다.");
	}
	void say() {
		System.out.println("대화로 사회 생활한다.");
	}
}
interface Fish {
	void breath();
	void live(); 
}
class Mermaid extends Person implements Fish { //extends는 다중 상속이 안된다. 그래서 interface의 implements를 사용해야 함.
	public void breath() {
		System.out.println("아가미로 숨을 쉰다.");
	}
	public void live() {
		System.out.println("물에서 산다.");
}
}
public class MermaidEx {
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move();
		mm.say();
		mm.breath();
		mm.live();
	}
}
