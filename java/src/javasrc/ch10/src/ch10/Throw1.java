package ch10;
public class Throw1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Throw Test");
		try {
			throw new Exception("내가 에러 발생시켰다");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		throw new Exception("또 에러 재밌네");
	}

}
