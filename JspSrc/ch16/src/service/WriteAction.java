package service;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;
public class WriteAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		Board board = new Board();
		try {	request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {	}
		board.setNum(Integer.parseInt(request.getParameter("num")));
		board.setWriter(request.getParameter("writer"));
		board.setSubject(request.getParameter("subject"));				
		board.setContent(request.getParameter("content"));
		board.setEmail(request.getParameter("email"));
		board.setPasswd(request.getParameter("passwd"));
		board.setRef(Integer.parseInt(request.getParameter("ref")));
		board.setRe_step(Integer.parseInt(request.getParameter("re_step")));
		board.setRe_level(Integer.parseInt(request.getParameter("re_level")));
		board.setIp(request.getParameter("ip"));
		String pageNum = request.getParameter("pageNum");
		String ip = request.getRemoteAddr();
		board.setIp(ip);
		BoardDao bd = BoardDao.getInstance();
		int result = bd.insert(board);
		
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("result", result);
		return "write.jsp";
	}
}