import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name1 = request.getParameter("name");
//		String addr1 = request.getParameter("addr");
//		String name=new String(name1.getBytes("8859_1"),"utf-8");
//		String addr=new String(addr1.getBytes("8859_1"),"utf-8");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("당신은 이름이 "+name+"이고<br>");
		out.println("사는 곳은 "+addr+"이네요");
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}