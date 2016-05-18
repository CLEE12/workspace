package shopping2.dao;
import java.util.List;
import shopping2.model.Emp;
public interface EmpDao {
	List<Emp> listEmp();

	Emp selectEmp(int empno);
}