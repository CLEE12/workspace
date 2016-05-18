package shopping3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import shopping3.model.Member;
import shopping3.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private Validator memberValidator;
	@Autowired
	private MemberService ms;
	@RequestMapping(value="memberlogin",method=RequestMethod.GET)
	public String memberLogin() {
		return "memberlogin";
	}
	@RequestMapping(value="memberlogin2",method=RequestMethod.GET)
	public String memberlogin2() {
		return "memberlogin2";
	}
	@ModelAttribute
	public Member setUp() {
		return new Member();
	}
	@RequestMapping(value="memberlogin",method=RequestMethod.POST) 
	public ModelAndView memberloginPro(Member member,
			BindingResult br) {
		ModelAndView mav = new ModelAndView();
		memberValidator.validate(member, br);
		if (br.hasErrors()) {
			mav.getModel().putAll(br.getModel());
			return mav;
		}
		try {
			Member mem = ms.chkMember(member.getId(),member.getPasswd());
			mav.addObject("member", mem);
			mav.setViewName("successMember");
		}catch(Exception e) {
			br.reject("error.login.member");
			mav.getModel().putAll(br.getModel());
		}
		return mav;
	}
	@RequestMapping(value="memberlogin2",method=RequestMethod.POST) 
	public ModelAndView memberloginPro2(Member member) {
		ModelAndView mav = new ModelAndView();		
		try {
			Member mem = ms.chkMember(member.getId(),member.getPasswd());
			mav.addObject("member", mem);
			mav.setViewName("successMember");
		}catch(Exception e) {
			mav.addObject("msg", "아이디 또는 암호가 다릅니다");
		}
		return mav;
	}
}