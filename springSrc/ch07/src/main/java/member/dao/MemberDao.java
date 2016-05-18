package member.dao;
import member.model.Member;
public interface MemberDao {
	int insert(Member member);
	String idCheck(String id);
	int loginChk(Member member);
	int delete(String id);
	Member select(String id);
	int update(Member member);
}