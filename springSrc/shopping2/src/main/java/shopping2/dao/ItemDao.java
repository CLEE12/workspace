package shopping2.dao;
import java.util.List;
import shopping2.model.Item;
public interface ItemDao {
	List<Item> listItem();

	Item selectItem(int itemId);
}