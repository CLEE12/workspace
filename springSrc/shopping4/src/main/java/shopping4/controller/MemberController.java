package shopping4.controller;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shopping4.model.Member;
import shopping4.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	@Autowired
	private Validator memberValidator;
	@RequestMapping(value="memberEntry",method=RequestMethod.GET)
	public String memberEntry() {
		return "memberEntry";
	}
	@RequestMapping(value="memberEntry2",method=RequestMethod.GET)
	public String memberEntry2() {
		return "memberEntry2";
	}
	@ModelAttribute
	public Member memberUp() {
		return new Member();
	}
	@RequestMapping(value="memberEntry",method=RequestMethod.POST)
	public ModelAndView memberEntry(Member member, BindingResult br) {
		ModelAndView mav = new ModelAndView();
		member.setReg_date(new Date());
		memberValidator.validate(member, br);
		if (br.hasErrors()) {
			mav.getModel().putAll(br.getModel());
			return mav;
		}
		try {
			ms.insert(member);
			mav.addObject("member",member);
			mav.setViewName("memberSuccess");
		}catch(Exception e) {
			br.reject("error.duplicate.member");
		}
		return mav;
	}
	@RequestMapping(value="memberEntry2",method=RequestMethod.POST)
	public ModelAndView memberEntry2(Member member) {
		ModelAndView mav = new ModelAndView();
		member.setReg_date(new Date());
		try {
			ms.insert(member);
			mav.addObject("member",member);
			mav.setViewName("memberSuccess");
		}catch(Exception e) {
			mav.addObject("msg","있는 데이터 인디");
		}
		return mav;
	}
}