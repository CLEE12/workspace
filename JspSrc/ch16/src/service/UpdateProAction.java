package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;

public class UpdateProAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		String pageNum = request.getParameter("pageNum");
		BoardDao bd = BoardDao.getInstance();
		Board board = new Board();
		
		board.setNum(Integer.parseInt(request.getParameter("num")));
		board.setWriter(request.getParameter("writer"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));
		board.setEmail(request.getParameter("email"));
		board.setPasswd(request.getParameter("passwd"));
		
		int result = bd.update(board);
		request.setAttribute("result", result);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("num", board.getNum());
		
		return "updatePro.jsp";
	}
}
