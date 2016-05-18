package ch09.dao;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ch09.model.Dept;
@Repository
public class DeptDaoImpl implements DeptDao {
	@Autowired
	private SqlSessionTemplate session;
	public List<Dept> list() {
		return session.selectList("dept.list");
	}
	public Dept select(int deptno) {
		return session.selectOne("dept.select",deptno);
	}
	public void insert(Dept dept) {
		session.insert("dept.insert",dept);		
	}
	public void delete(int deptno) {
		session.delete("dept.delete",deptno);
	}
	public void update(Dept dept) {
		session.update("dept.update",dept);		
	}	
}