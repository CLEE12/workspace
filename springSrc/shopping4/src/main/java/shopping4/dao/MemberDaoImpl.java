package shopping4.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping4.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	public void insert(Member member) {
		String sql="insert into member2 values(:id,:passwd," +
			":name,:address,:tel,:reg_date)";
		npjt.update(sql,new BeanPropertySqlParameterSource(member));
	}
}