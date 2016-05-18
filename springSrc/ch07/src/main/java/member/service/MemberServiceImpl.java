package member.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import member.dao.MemberDao;
import member.model.Member;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	public int insert(Member member) {
		return md.insert(member);
	}
	public String idCheck(String id) {
		return md.idCheck(id);
	}
	public int loginChk(Member member) {
		return md.loginChk(member);
	}
	public int delete(String id) {
		return md.delete(id);
	}
	public Member select(String id) {
		return md.select(id);
	}
	public int update(Member member) {
		return md.update(member);
	}
}