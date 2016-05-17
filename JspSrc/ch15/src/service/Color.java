package service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Color implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] color = {"red","orange","yellow","green","blue",
			"navy","violet"};
		int num = (int)(Math.random()*7);
		request.setAttribute("color", color[num]);
		return "color.jsp";
	}
}