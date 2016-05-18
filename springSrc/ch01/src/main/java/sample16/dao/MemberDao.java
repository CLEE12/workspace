package sample16.dao;
import java.util.Collection;
import sample16.model.Member;
public interface MemberDao {
	Member selectByEmail(String email);
	void insert(Member member);
	void update(Member member);
	Collection<Member> selectAll();
}