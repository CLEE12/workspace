package shopping2.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping2.model.Item;
@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private JdbcTemplate jt;
	public List<Item> listItem() {
		return jt.query("select * from item", 
			new BeanPropertyRowMapper<Item>(Item.class));
	}
	public Item selectItem(int itemId) {
	    return jt.queryForObject("select * from item where itemId=?",
			new BeanPropertyRowMapper<Item>(Item.class),itemId);
	}
}