package shopping2.service;
import java.util.List;
import shopping2.model.Emp;
public interface EmpService {
	List<Emp> listEmp();

	Emp selectEmp(int empno);
}