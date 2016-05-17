package service;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;
public class ListAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int rowPerPage   = 10;
		int pagePerBlock = 10;
		String pageNum   = request.getParameter("pageNum");
		if (pageNum==null||pageNum.equals("null")||pageNum.equals(""))
			pageNum = "1";
		int nowPage = Integer.parseInt(pageNum);
		BoardDao bd = BoardDao.getInstance();
		int total = bd.selectTotal();  
		int totalPage = (int)Math.ceil((double)total/rowPerPage);
		int startRow  = (nowPage - 1) * rowPerPage + 1;
		int endRow    = startRow + rowPerPage - 1;
		int totalBlk  = (int)Math.ceil((double)totalPage/pagePerBlock);
		int startPage = (nowPage - 1)/10*10 + 1;
		int endPage   = startPage + pagePerBlock - 1;
		if (endPage > totalPage ) endPage = totalPage;
		total = total - startRow +1;
		List<Board> list = bd.selectList(startRow,endRow);
		
		request.setAttribute("rowPerPage", rowPerPage);
		request.setAttribute("pagePerBlock", pagePerBlock);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("nowPage", nowPage);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("totalBlk", totalBlk);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("total", total);
		request.setAttribute("list", list);

		return "list.jsp";
	}
}