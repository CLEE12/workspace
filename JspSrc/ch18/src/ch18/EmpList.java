package ch18;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EmpList")
public class EmpList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		EmpDao ed = EmpDao.getInstance();
		List<Emp> list = ed.selectList(deptno);
		String str = "";
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if (list !=null) {
			for(Emp e : list) {
				str=e.getEmpno()+" "+e.getEname()+" "+e.getJob()
					+" "+e.getMgr()+" "+e.getHiredate()+" "+
					e.getSal()+" "+e.getComm()+" "+
					e.getDeptno()+"<br>";
				out.println(str);
			}
		}
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}