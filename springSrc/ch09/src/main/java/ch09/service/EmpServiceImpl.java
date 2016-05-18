package ch09.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch09.dao.EmpDao;
import ch09.model.DeptEmp;
import ch09.model.Emp;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao ed;
	public List<Emp> list(int deptno) {
		return ed.list(deptno);
	}
	public List<DeptEmp> listAll() {
		return ed.listAll();
	}
	public Emp select(int empno) {
		return ed.select(empno);
	}
	public void insert(Emp emp) {
		ed.insert(emp);
	}
	public void delete(int empno) {
		ed.delete(empno);
	}
	public void update(Emp emp) {
		ed.update(emp);
	}
}