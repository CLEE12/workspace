package ch09.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch09.dao.DeptDao;
import ch09.model.Dept;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao dd;
	public List<Dept> list() {
		return dd.list();
	}
	public Dept select(int deptno) {
		return dd.select(deptno);
	}
	public void insert(Dept dept) {
		dd.insert(dept);		
	}
	public void delete(int deptno) {
		dd.delete(deptno);
	}
	public void update(Dept dept) {
		dd.update(dept);
	}
}