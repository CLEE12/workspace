package member.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.model.Member;
import member.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String joinForm() {
		return "join";
	}
	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="main")
	public String main() {
		return "main";
	}
	@RequestMapping(value="logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main";
	}
	@RequestMapping(value="loginPro")
	public String loginPro(Member member,Model model,HttpSession session) {
		int result = ms.loginChk(member);
		if (result == 0) {
			model.addAttribute("msg", "암호가 다르네");
		} else if (result== -1) {
			model.addAttribute("msg","없는 아이디입니다");
		} else {	
			session.setAttribute("id",member.getId());
			return "main";
		}
		return "login";
	}
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(Member member, Model model) {
		int result = ms.insert(member);
		if (result > 0) return "login";
		else {
			model.addAttribute("msg", "입력 실패 확인하세요");
			return "join";
		}
	}
	@RequestMapping(value="delete")
	public String delete(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
		int result = ms.delete(id);
		if (result >0) {
			session.invalidate();
			return "login";
		} else {
			model.addAttribute("msg", "탙퇴 실패, 못 빠져나가");
			return "main";
		}
	}
	@RequestMapping(value="idCheck")
	public String idCheck(String id, Model model) {
		String result = ms.idCheck(id);
		String msg = "";
		if (result == null) msg = "사용가능한 ID입니다";
		else msg = "이미 사용중이니 다른 아이디를 선택하셍";
		model.addAttribute("msg",msg);
	//	model.addAttribute("id",result);
	//	return "join";
		return "idCheck";
	}
	@RequestMapping(value="updateForm")
	public String upDateForm(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
		return "updateForm";
	}
	@RequestMapping(value="update")
	public String update(Member member,Model model) {
		int result = ms.update(member);
		if (result > 0) return "main";
		else {
			model.addAttribute("msg", "똑바로 해");
			return "redirect:updateForm.do";
		}
	}
}