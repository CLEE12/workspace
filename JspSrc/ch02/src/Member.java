import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age  = request.getParameter("age");
		String gender = request.getParameter("gender");
		String hobby  = request.getParameter("hobby");
		String[] email  = request.getParameterValues("email");
		GregorianCalendar gc = new GregorianCalendar();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>환영 ! 회원가입 결과</h2>");
		out.println("이름 : "+name+"<p>나이 : "+age+"<p>성별 : ");
		out.println(gender+"<p>취미 : "+hobby+"<p>이메일 : ");
		for(String st : email) {	out.println(st+" ");	}
		/*if(email!=null) {
			for(int i=0; i<email.length; i++) {
				if(i==0) out.println(email[i]);
				else out.println(", "+email[i]);
			}
		}*/
		out.printf("<p>날자/시간 : %TF %TT",gc,gc);
		out.println("</body></html>");		
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}