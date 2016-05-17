package service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Message implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "귀찮아! 이건모야 ! 김건모";
		request.setAttribute("msg", msg);
		return "message.jsp";
	}	
}