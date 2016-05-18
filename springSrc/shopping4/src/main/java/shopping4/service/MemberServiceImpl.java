package shopping4.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping4.dao.MemberDao;
import shopping4.model.Member;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	public void insert(Member member) {
		md.insert(member);		
	}
}