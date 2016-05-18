package sample17;
import java.util.Date;
public class MemberInsertImpl implements MemberInsert {
	private MemberDao md;	
	public MemberInsertImpl(MemberDao md) {
		this.md = md;
	}
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