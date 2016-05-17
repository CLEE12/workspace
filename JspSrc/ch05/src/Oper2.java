

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Oper2")
public class Oper2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h3>두수의 연산</h3>");
		try {
			int num1=Integer.parseInt(request.getParameter("num1"));
			int num2=Integer.parseInt(request.getParameter("num2"));
			out.printf("덧셈   : %d+%d=%d<p>",num1,num2,num1+num2);
			out.printf("뺄셈   : %d-%d=%d<p>",num1,num2,num1-num2);
			out.printf("곱셈   : %d*%d=%d<p>",num1,num2,num1*num2);
			out.printf("나눗셈 : %d/%d=%d<p>",num1,num2,num1/num2);
		}catch(Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp"); //가장 중요한 것.
			rd.forward(request, response);
		}
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
