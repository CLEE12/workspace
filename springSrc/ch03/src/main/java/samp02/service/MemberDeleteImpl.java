package samp02.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samp02.dao.MemberDao;
import samp02.model.Member;
@Service
public class MemberDeleteImpl implements DeleteMember {
	@Autowired
	private MemberDao md;
	public int delete(String id) {
		int result = 0;
		Member member = md.getMember(id);
		if (member == null) {
			System.out.println("데이터가 없는데 어쩌라구");
		} else {
			result = md.delete(id);
		}
		return result;
	}
}