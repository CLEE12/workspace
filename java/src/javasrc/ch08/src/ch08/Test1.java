package ch08;
interface Robot {}
class DanceRobot implements Robot {
	void dance() {
		System.out.println("춤춘다");
	}
}
class SingRobot implements Robot {
	void sing() {
		System.out.println("노래 부른다");
	}
}
class DrawRobot implements Robot {
	void draw() {
		System.out.println("그리을 그린다");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Robot[] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new SingRobot();
		rb[2] = new DrawRobot();
		for(Robot r :rb) {
			if(r instanceof DanceRobot)((DanceRobot)r).dance();
			else if(r instanceof SingRobot)((SingRobot)r).sing();
			else((DrawRobot)r).draw();
		}
	}

}
