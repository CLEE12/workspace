package sample15.service;
import sample15.dao.MemberDao;
import sample15.model.Member;
public class ChanagePasswordImpl implements ChangePassword {
	private MemberDao md;	
	public void setMd(MemberDao md) {
		this.md = md;
	}
	public int changePass(String email, String oldPassword, String newPassword) {
		int result = 0;
		Member member = md.selectByEmail(email);
		if (member ==null) System.out.println("없는 자료인데 뭐 !");
		else {
			int chk=member.changePassword(oldPassword,newPassword);
			if (chk > 0) {
				md.update(member);  result = 1;
			}
		}
		return result;
	}
}