package shopping1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping1.dao.Dept;
import shopping1.dao.DeptDao;
import shopping1.dao.Item;
import shopping1.dao.ItemDao;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao id;
	@Autowired
	private DeptDao dd;
	public List<Item> list() {
		return id.list();
	}
	public List<Dept> selectAll() {
		return dd.selectAll();
	}
}