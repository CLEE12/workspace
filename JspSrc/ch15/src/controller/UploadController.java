package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsItem;
import service.InsertPds;
import service.SelectList;
@WebServlet("*.action")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri  = request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length()+1);
		if (command.equals("pds/upload.action")) {
			InsertPds ipd = new InsertPds();
			int result = ipd.insert(request);
			if (result > 0 ) response.sendRedirect("success.jsp");
			else response.sendRedirect("fileUploadForm.jsp");
		} else if (command.equals("pds/list.action")) {
			SelectList sl = new SelectList();
			List<PdsItem> list = sl.selectAll();
			request.setAttribute("list", list);
			RequestDispatcher rd = 
				request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}