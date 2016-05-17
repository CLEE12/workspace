package ch06;
class SingleTon {
	private static SingleTon instance = new SingleTon(); //<--new SingleTon();를 뒤에 추가 함으로써 if 구문을 삭제.
    private SingleTon() {}                               //   정확하게는 instance = new SingleTon();
    public static SingleTon getInstance() {
        /*    	
        *if(instance == null) {
    	   instance = new SingleTon();
    	}
        */    	
    	return instance;

    }
}
public class SingleTest {
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		//SingleTon s1 = new SingleTon(); // <-- private에 접근할 수 없어 애러 발생.
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
