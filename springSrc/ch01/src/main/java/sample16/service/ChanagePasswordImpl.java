package sample16.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample16.dao.MemberDao;
import sample16.model.Member;
@Service
public class ChanagePasswordImpl implements ChangePassword {
	@Autowired
	private MemberDao md;	
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