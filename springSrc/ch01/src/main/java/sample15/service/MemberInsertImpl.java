package sample15.service;
import java.util.Date;
import sample15.dao.MemberDao;
import sample15.model.Member;
import sample15.model.RegisterMember;
public class MemberInsertImpl implements MemberInsert {
	private MemberDao md;	
	public void setMd(MemberDao md) {	this.md = md;	}
	public int insert(RegisterMember rm) {
		int result = 0;
		Member member = md.selectByEmail(rm.getEmail());
		if (member != null) {
			System.out.println("이미 있는디 ?");
		} else { 
			md.insert(new Member(rm.getEmail(), rm.getPassword(),
				rm.getName(), new Date()));
			result = 1;
		}		
		return result;
	}
}