package shopping3.dao;
import shopping3.model.Member;
public interface MemberDao {
	Member chkMember(String id, String passwd);
}