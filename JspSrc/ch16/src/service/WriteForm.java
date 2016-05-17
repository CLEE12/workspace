package service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;
public class WriteForm implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int num =0,ref=0,re_step=0,re_level=0;
		String pageNum = request.getParameter("pageNum");
		if (request.getParameter("num") != null) { // 답변
			num = Integer.parseInt(request.getParameter("num"));
			BoardDao bd = BoardDao.getInstance();
			Board board = bd.select(num);
			ref = board.getRef();
			re_step  = board.getRe_step();
			re_level = board.getRe_level();
		}
		request.setAttribute("num", num);
		request.setAttribute("ref", ref);
		request.setAttribute("re_step", re_step);
		request.setAttribute("re_level", re_level);
		request.setAttribute("pageNum", pageNum);
		
		return "writeForm.jsp";
	}
}