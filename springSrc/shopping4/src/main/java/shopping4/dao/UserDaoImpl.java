package shopping4.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping4.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	public void insert(User user) {
		String sql="insert into userAccount values(:userId,"+
	     ":userName,:password,:postCode,:address,"+
		 ":email,:job,:birthday)";
		npjt.update(sql,new BeanPropertySqlParameterSource(user));
	}
}