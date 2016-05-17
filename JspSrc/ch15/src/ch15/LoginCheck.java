package ch15;
public class LoginCheck {
	public int check(String id, String pass) {
		int result = 0;
		if (id.equals("kk") && pass.equals("1234")) {
			result = 1;
		}
		return result;
	}
}