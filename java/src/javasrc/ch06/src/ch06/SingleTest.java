package ch06;
class SingleTon {
	private static SingleTon instance = new SingleTon(); //<--new SingleTon();�� �ڿ� �߰� �����ν� if ������ ����.
    private SingleTon() {}                               //   ��Ȯ�ϰԴ� instance = new SingleTon();
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
		//SingleTon s1 = new SingleTon(); // <-- private�� ������ �� ���� �ַ� �߻�.
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
