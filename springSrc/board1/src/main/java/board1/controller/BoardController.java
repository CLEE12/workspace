package board1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board1.model.Board;
import board1.service.BoardService;
@Controller
public class BoardController {
	@Autowired
	private BoardService bs;
	@RequestMapping("list")
	public String list(Model model) {
		List<Board> list = bs.list();
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping(value="write",method=RequestMethod.GET)
	public String writeForm() {
		return "write";
	}
	@RequestMapping(value="write",method=RequestMethod.POST)
	public String write(Board board, Model model) {
		int result = bs.insert(board);
		if (result > 0) return "redirect:list.do";
		else {
			model.addAttribute("msg", "죽을 래");
			return "write";		
		}		
	}
	@RequestMapping(value="view")
	public String view(int id, Model model) {
		bs.updateHit(id);
		Board board = bs.select(id);
		model.addAttribute("board", board);
		return "view";				
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String updateForm(int id,Model model) {
		Board board = bs.select(id);
		model.addAttribute("board", board);
		return "update";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(Board board,Model model) {
		int result = bs.update(board);
		if (result > 0) return "redirect:list.do";
		else {
			model.addAttribute("msg", "죽을 래");
			return "forward:update.do?id="+board.getId();		
		}		
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String delete(int id) {
		bs.delete(id);
		return "redirect:list.do";
	}
}