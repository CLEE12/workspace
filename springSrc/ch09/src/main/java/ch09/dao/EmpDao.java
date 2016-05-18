package ch09.dao;
import java.util.List;

import ch09.model.DeptEmp;
import ch09.model.Emp;
public interface EmpDao {
	List<Emp> list(int deptno);
	List<DeptEmp> listAll();
	Emp select(int empno);
	void insert(Emp emp);
	void delete(int empno);
	void update(Emp emp);
}