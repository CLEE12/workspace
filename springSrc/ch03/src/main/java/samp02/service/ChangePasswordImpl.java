package samp02.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samp02.dao.MemberDao;
import samp02.model.Member;
@Service
public class ChangePasswordImpl implements ChangePassWord {
	@Autowired
	private MemberDao md;
	public int changePass(String id, String oldPass, String newPass) {
		int result = 0;
		Member member = md.getMember(id);
		if (member==null) {
			System.out.println("없는 멤버 입니다");
		} else {
			int chk = member.changePassword(oldPass, newPass);
			if (chk > 0) result = md.update(member);
		}
		return result;
	}
}