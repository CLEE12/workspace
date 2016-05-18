package shopping3.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping3.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private JdbcTemplate jt;
	public Member chkMember(String id, String passwd) {
		String sql="select * from member2 where id=? and passwd=?";
		return jt.queryForObject(sql, 
			new BeanPropertyRowMapper<Member> (Member.class),
				id,passwd);		
	}
}