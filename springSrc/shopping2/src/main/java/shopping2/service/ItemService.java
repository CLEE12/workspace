package shopping2.service;
import java.util.List;
import shopping2.model.Item;
public interface ItemService {
	List<Item> listItem();
	Item selectItem(int itemId);
}