import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Color")
public class Color extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String col = request.getParameter("color");
/*		String color ="";
		if (col.equals("빨강")) color="red";
		else if (col.equals("주황")) color="orange";
		else if (col.equals("노랑")) color="yellow";
		else if (col.equals("초록")) color="green";
		else if (col.equals("파랑")) color="blue";
		else if (col.equals("남색")) color="navy";
		else if (col.equals("보랑")) color="violet";*/
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor="+col+">");
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}