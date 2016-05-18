package shopping2.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import shopping2.model.Emp;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jt;
	public List<Emp> listEmp() {
		return jt.query("select empno,ename,job,nvl(mgr,0) mgr,"
			+ "hiredate,sal,nvl(comm,0) comm,deptno from emp", 
			new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	public Emp selectEmp(int empno) {
		return jt.queryForObject("select empno,ename,job,"
			+ "nvl(mgr,0) mgr,hiredate,sal,nvl(comm,0) comm,"
			+ "deptno from emp where empno=?", 
			new BeanPropertyRowMapper<Emp>(Emp.class),empno);
	}
}