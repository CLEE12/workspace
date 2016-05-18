package shopping1.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import shopping1.dao.Dept;
import shopping1.service.ItemService;
public class IndexController2 implements Controller{
	@Autowired
	private ItemService is;
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<Dept> list = is.selectAll();
		mav.addObject("list",list);
		mav.setViewName("/WEB-INF/views/deptList.jsp");
		return mav;
	}
}