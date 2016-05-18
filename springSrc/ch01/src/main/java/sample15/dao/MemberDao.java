package sample15.dao;
import java.util.Collection;
import sample15.model.Member;
public interface MemberDao {
	Member selectByEmail(String email);
	void insert(Member member);
	void update(Member member);
	Collection<Member> selectAll();
}