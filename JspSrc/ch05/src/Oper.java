

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
		}catch(NumberFormatException e) {
			out.println("그게 숫자냐, 똑바로 입력해.");
		}catch(ArithmeticException e) {
			out.println("0으로 나눌 수 없습니다.");
		}
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
