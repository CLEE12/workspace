package shopping4.controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shopping4.model.User;
import shopping4.service.UserService;
@Controller
public class UserEntryController {
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private Validator userValidator;
	@Autowired
	private UserService us;
	@RequestMapping(value="userEntry",method=RequestMethod.GET)
	public String userEntry() {
		return "userEntry";
	}
	@RequestMapping(value="userEntry2",method=RequestMethod.GET)
	public String userEntry2() {
		return "userEntry2";
	}
	@ModelAttribute
	public User setUp() {
		User user = new User();
		MessageSourceAccessor msa = 
			new MessageSourceAccessor(messageSource);
		user.setUserId(msa.getMessage("user.userId.default"));
		user.setUserName(msa.getMessage("user.userName.default"));
		return user;
	}
	@InitBinder
	public void InitBinder(WebDataBinder wdb) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		wdb.registerCustomEditor(Date.class, "birthday",
		new CustomDateEditor(df, true));
	}
	@RequestMapping(value="userEntry",method=RequestMethod.POST)
	public ModelAndView userEntry(User user,BindingResult br) {
		ModelAndView mav = new ModelAndView();
		userValidator.validate(user, br);
		if (br.hasErrors()) {
			mav.getModel().putAll(br.getModel());
			return mav;
		}
		try {
			us.insert(user);
			mav.addObject("user", user);
			mav.setViewName("userSuccess");
		}catch(Exception e) {
			br.reject("error.duplicate.user");
		}
		return mav;
	}
	@RequestMapping(value="userEntry2",method=RequestMethod.POST)
	public ModelAndView userEntry2(User user) {
		ModelAndView mav = new ModelAndView();
		try {
			us.insert(user);
			mav.addObject("user", user);
			mav.setViewName("userSuccess");
		}catch(Exception e) {
			mav.addObject("msg", "이미 있는 데이터 입니다");
		}
		return mav;
	}
}