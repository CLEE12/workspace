package shopping3.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping3.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jt;
	public User chk(String userId, String password) {
		String sql = "select * from userAccount where userId=? "+
				" and password=?";				
		return jt.queryForObject(sql, 
			new BeanPropertyRowMapper<User>(User.class),
			userId,password);
	}
}