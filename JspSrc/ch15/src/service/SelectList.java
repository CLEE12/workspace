package service;
import java.util.List;
import dao.PdsItemDao;
import model.PdsItem;
public class SelectList {
	public List<PdsItem> selectAll() {
		PdsItemDao pd = PdsItemDao.getInstance();
		List<PdsItem> list = pd.selectAll();
		return list;
	}
}