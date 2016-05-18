package samp02.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samp02.dao.MemberDao;
import samp02.model.Member;
@Service
public class MemberInsertImpl implements MemberInsert {
	@Autowired
	private MemberDao md;
	public int insert(Member member) {
		int result = 0;
		Member mem = md.getMember(member.getId());
		if (mem != null)  {
			System.out.println("있는 데이터 인데");			
		} else {
			result = md.insert(member);
		}
		return result;
	}
}