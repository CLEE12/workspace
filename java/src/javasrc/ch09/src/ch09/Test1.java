package ch09;
class ThreeD {
	int x, y, z;
	public ThreeD(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public boolean equals(ThreeD obj) {
		return x==obj.x && y==obj.y && z==obj.z;
	}
	public String toString() {
		return "[x="+x+",y="+y+",z="+z+"]";
	}
}
public class Test1 {
	public static void main(String[] args) {
		ThreeD t1 = new ThreeD(1,2,3);
		ThreeD t2 = new ThreeD(1,2,3);
		if(t1.equals(t2)) System.out.println("같다");
		else System.out.println("다르다");
		System.out.println("t1 = "+t1);
		System.out.println("t2 = "+t2);
	}

}
