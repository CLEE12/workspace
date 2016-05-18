package com.ch.hello;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	@RequestMapping(value = "addr", method = RequestMethod.GET)
	public String addr() {
		return "addr";
	}
	@RequestMapping(value = "addr1", method = RequestMethod.GET)
	public String addr1(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String msg  = name+"님 "+addr+"에 사시는 군요";
		model.addAttribute("msg", msg);
		return "addr1";
	}	
	@RequestMapping(value = "addr2", method = RequestMethod.POST)
	public String addr2(String name,String addr, Model model) {
		String msg  = name+"님 "+addr+"에 사시는 군요 2";
		model.addAttribute("msg", msg);
		return "addr1";
	}
	@RequestMapping(value = "addr3", method = RequestMethod.POST)
	public String addr3(Person person, Model model) {		
		model.addAttribute("person", person);
		return "addr3";
	}
	@RequestMapping(value = "color", method = RequestMethod.GET)
	public String color() {		
		return "color";
	}
	@RequestMapping(value = "color", method = RequestMethod.POST)
	public String colorResult(String color,Model model) {
		model.addAttribute("color", color);
		return "colorResult";
	}
}