package shopping3.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping3.dao.MemberDao;
import shopping3.model.Member;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	public Member chkMember(String id, String passwd) {
		return md.chkMember(id, passwd);
	}
}