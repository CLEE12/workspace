package sample16.service;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sample16.dao.MemberDao;
import sample16.model.Member;
import sample16.model.RegisterMember;
@Service
public class MemberInsertImpl implements MemberInsert {
	@Autowired
	private MemberDao md;	
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