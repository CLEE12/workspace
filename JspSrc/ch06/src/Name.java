import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Name")
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter log;
	public void init() throws ServletException {
		try{
			log=new PrintWriter(new FileWriter("c:/gov/log.txt"));
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		GregorianCalendar gc = new GregorianCalendar();
		String date = String.format("%TF %TT", gc, gc);
		String msg = "안녕하세요 "+name+"님 !!\t"+date+"\r\n";
		log.write(msg);
		out.println("<html><body>"+msg+"</body></html>");
		out.close();
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
		
	public void destroy() {
		if(log !=null)
			log.close();
	}
}
