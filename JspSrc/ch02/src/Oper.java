import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Oper")
public class Oper extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>사칙연산 결과</h2>");
		out.printf("덧셈 : %d + %d = %d<br>",num1,num2,num1+num2);
		out.printf("뺄셈 : %d - %d = %d<br>",num1,num2,num1-num2);
		out.printf("곱셈 : %d * %d = %d<br>",num1,num2,num1*num2);
		if (num2!=0) 
			out.printf("나눗셈 - 몫 = %d, 나머지 = %d<br>",
					num1/num2,num1%num2);
		else out.println("0은 나눌 수 없습니다");
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}