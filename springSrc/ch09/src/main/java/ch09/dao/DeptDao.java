package ch09.dao;
import java.util.List;
import ch09.model.Dept;
public interface DeptDao {
	List<Dept> list();
	Dept select(int deptno);
	void insert(Dept dept);
	void delete(int deptno);
	void update(Dept dept);
}