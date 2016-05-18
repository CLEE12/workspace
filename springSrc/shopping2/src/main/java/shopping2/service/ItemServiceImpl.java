package shopping2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping2.dao.ItemDao;
import shopping2.model.Item;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao id;
	public List<Item> listItem() {
		return id.listItem();
	}
	public Item selectItem(int itemId) {
		return id.selectItem(itemId);
	}	
}