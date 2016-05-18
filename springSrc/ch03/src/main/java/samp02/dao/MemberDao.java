package samp02.dao;
import java.util.List;
import samp02.model.Member;
public interface MemberDao {
	Member getMember(String id);
	List<Member> getList();
	int insert(Member mem);
	int update(Member mem);
	int delete(String id);
}