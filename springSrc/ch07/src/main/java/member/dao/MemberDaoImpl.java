package member.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import member.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlMapClientTemplate st;
	public int insert(Member member) {
		st.insert("insert", member);
		return 1;
	}
	public String idCheck(String id) {
		return (String)st.queryForObject("idCheck",id);
	}
	public int loginChk(Member member) {
		int result = 0;
		String dbPass=(String)st.queryForObject("loginChk",member);
		if (dbPass==null) result = -1;
		else if (dbPass.equals(member.getPass())) result = 1;
		else result  = 0;
		return result;
	}
	public int delete(String id) {
		return st.delete("delete",id);
	}
	public Member select(String id) {
		return (Member) st.queryForObject("select",id);
	}
	public int update(Member member) {
		return st.update("update",member);
	}
}