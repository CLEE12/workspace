package shopping1.service;
import java.util.List;
import shopping1.dao.Dept;
import shopping1.dao.Item;
public interface ItemService {
	List<Item> list();
	List<Dept> selectAll();
}