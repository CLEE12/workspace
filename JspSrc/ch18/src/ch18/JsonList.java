package ch18;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
@WebServlet("/JsonList")
public class JsonList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		EmpDao ed = EmpDao.getInstance();
		List<Emp1> list = ed.selectList1(deptno);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if (list !=null) {
			JSONArray json = JSONArray.fromObject(list);
			out.println(json);
		}
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}