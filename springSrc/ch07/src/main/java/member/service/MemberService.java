package member.service;
import member.model.Member;
public interface MemberService {
	int insert(Member member);
	String idCheck(String id);
	int loginChk(Member member);
	int delete(String id);
	Member select(String id);
	int update(Member member);
}