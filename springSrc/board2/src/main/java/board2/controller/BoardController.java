package board2.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import board2.model.Board;
import board2.service.BoardService;
import board2.service.PagingBean;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs;
	@RequestMapping("list")
	public String list(Board board, String pageNum, Model model) {
		final int rowPerPage = 10;
		if (pageNum == null || pageNum.equals(""))
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		board.setStartRow(startRow);
		board.setEndRow(endRow);
		int total = bs.getTotal(board);
		PagingBean pb = new PagingBean(currentPage, total);
		List<Board> list = bs.list(board);
		model.addAttribute("list", list);
		model.addAttribute("pb", pb);
		if (board.getKeyword() != null) {
			model.addAttribute("keyword", board.getKeyword());
			model.addAttribute("search", board.getSearch());
		}
		return "list";
	}

	@RequestMapping("writeForm")
	public String writeForm(Board board, String pageNum,String num, Model model) {
		board.setNum(0);
		board.setRef(0);
		board.setRe_level(0);
		board.setRe_step(0);
		// 답변글 시작
		if (num != null) {
			int no = Integer.parseInt(num);
			Board brd = bs.select(no);
			board.setNum(brd.getNum());
			board.setRef(brd.getRef());
			board.setRe_level(brd.getRe_level());
			board.setRe_step(brd.getRe_step());
		} 
		// 끝
		model.addAttribute("board", board);
		model.addAttribute("pageNum", pageNum);
		return "write";
	}

	@RequestMapping("write")
	public String write(Board board, String pageNum, Model model, HttpServletRequest request) {
		int number = bs.getNumber();
		// 답변글 시작
		if (board.getNum() != 0) {
			bs.updateRe_step(board);
			board.setRe_level(board.getRe_level()+1);
			board.setRe_step(board.getRe_step()+1);
		} else {	board.setRef(number);		}	
		// 답변글 끝
		String ip = request.getRemoteAddr();
		board.setNum(number);
		board.setIp(ip);
		int result = bs.write(board);
		model.addAttribute("pageNum", pageNum);
		if (result > 0)
			return "redirect:list.do";
		else {
			model.addAttribute("msg", "으이그 화상");
			model.addAttribute("board", board);
			return "forward:writeForm.do";
		}
	}

	@RequestMapping("view")
	public String view(int num, String pageNum, Model model) {
		bs.updateReadCount(num);
		Board board = bs.select(num);
		model.addAttribute("board", board);
		model.addAttribute("pageNum", pageNum);
		return "view";
	}

	@RequestMapping("delete")
	public String delete(int num, String pageNum, Model model) {
		bs.delete(num);
		return "redirect:list.do?pageNum=" + pageNum;
	}

	@RequestMapping("updateForm")
	public String updateForm(int num, String pageNum, Model model) {
		Board board = bs.select(num);
		model.addAttribute("board", board);
		model.addAttribute("pageNum", pageNum);
		return "updateForm";
	}

	@RequestMapping("updatePro")
	public String updatePro(Board board, String pageNum, Model model) {
		int result = bs.update(board);
		if (result > 0)
			return "redirect:list.do?pageNum=" + pageNum;
		else {
			model.addAttribute("msg", "잘해봐 으이그");
			return "forward:updateForm.do?num=" + board.getNum() + "&pageNum=" + pageNum;
		}
	}	
}