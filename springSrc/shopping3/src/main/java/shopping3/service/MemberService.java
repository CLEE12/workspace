package shopping3.service;
import shopping3.model.Member;
public interface MemberService {
	Member chkMember(String id, String passwd);
}