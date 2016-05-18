package ch09.dao;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch09.model.DeptEmp;
import ch09.model.Emp;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private SqlSessionTemplate session;
	public List<Emp> list(int deptno) {
		return session.selectList("emp.list",deptno);
	}
	public List<DeptEmp> listAll() {
		return session.selectList("deptEmp.list");
	}
	public Emp select(int empno) {
		return session.selectOne("emp.select",empno);
	}
	public void insert(Emp emp) {
		session.insert("emp.insert",emp);
	}
	public void delete(int empno) {
		session.delete("emp.delete",empno);
	}
	public void update(Emp emp) {
		session.update("emp.update",emp);
	}
}