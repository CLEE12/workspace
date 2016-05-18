package shopping2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping2.dao.EmpDao;
import shopping2.model.Emp;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao ed;
	public List<Emp> listEmp() {
		return ed.listEmp();
	}
	public Emp selectEmp(int empno) {
		return ed.selectEmp(empno);
	}
}