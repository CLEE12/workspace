package sample15.service;
public interface ChangePassword {
	int changePass(String email,String oldPassword,
			String newPassword);
}