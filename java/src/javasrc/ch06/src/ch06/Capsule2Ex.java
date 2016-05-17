package ch06;
class P2 { //encapsulation(캡슐화), information hidding(정보은닉)
	private String name;
	private int age;
	public void setName(String name) { //캡슐화. private은 접근이 안됨.
		this.name = name; //캡슐화 과정.
	} // Generator를 사용할 땐 커서의 위치가 중요.
	
	public void setAge(int age) {
		if (age <10) {this.age = 20;
		System.out.println("똑바로해");
		}
		else this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		if(age<=0) System.out.println("에이 그런나이가 어딨어");
		return age;
	}
	void print() {
		//System.out.println(name+"의 나이는 "+age+"이다.");
	}
}
public class Capsule2Ex {
	public static void main(String[] args) {
		P2 p = new P2();
		p.setName ("수지"); //p.name = "수지"; 에서 캡슐화된것을 출력할 수 있게 변경.
		p.setAge  (22);
		p.print();
		System.out.println(p.getName()+"는 "+p.getAge()+"살이다.");
	}

}
