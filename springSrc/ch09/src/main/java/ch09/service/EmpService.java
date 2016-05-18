package ch09.service;
import java.util.List;
import ch09.model.DeptEmp;
import ch09.model.Emp;
public interface EmpService {
	List<Emp> list(int deptno);
	List<DeptEmp> listAll();
	Emp select(int empno);
	void insert(Emp emp);
	void delete(int empno);
	void update(Emp emp);
}