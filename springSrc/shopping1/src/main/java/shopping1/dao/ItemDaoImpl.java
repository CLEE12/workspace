package shopping1.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private JdbcTemplate jt;
	public List<Item> list() {
		return jt.query("select * from item", 
			new BeanPropertyRowMapper<Item>(Item.class));
	}
}