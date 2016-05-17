import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fivonacci")
public class Fivonacci extends HttpServlet {
	BigInteger[] arr = new BigInteger[100];
	private static final long serialVersionUID = 1L; {
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		for (int i=2; i<arr.length; i++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num=Integer.parseInt(request.getParameter("num"));
		if(num>100) num=100;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h3>피보나치 수열 결과</h3>");
		for(int i=0; i<num; i++) {
			out.println(arr[i]+"<br>");
		}
		out.println("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
