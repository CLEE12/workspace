package shopping3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shopping3.model.User;
import shopping3.service.UserService;
@Controller
public class LoginController {
	@Autowired
	private Validator loginValidator;
	@Autowired
	private UserService us;
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="login2",method=RequestMethod.GET)
	public String login2() {
		return "login2";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(User user,BindingResult br) {
		ModelAndView mav = new ModelAndView();
		loginValidator.validate(user, br);
		if (br.hasErrors()) {
			mav.getModel().putAll(br.getModel());
			return mav;
		}
		try {
			User u = us.chk(user.getUserId(), user.getPassword());
			mav.setViewName("loginSuccess");
			mav.addObject("user",u);
		}catch(Exception e) {
			br.reject("error.login.user");
			mav.getModel().putAll(br.getModel());
		}
		return mav;
	}
	@RequestMapping(value="login2",method=RequestMethod.POST)
	public ModelAndView login2(User user) {
		ModelAndView mav = new ModelAndView();
		try {
			User u = us.chk(user.getUserId(), user.getPassword());
			mav.setViewName("loginSuccess");
			mav.addObject("user",u);
		}catch(Exception e) {
			mav.addObject("msg","아이디나 암호가 다릅니다");
		}
		return mav;
	}
	@ModelAttribute
	public User setUp() {
		return new User();
	}
}