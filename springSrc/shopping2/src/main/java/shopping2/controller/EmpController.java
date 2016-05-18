package shopping2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shopping2.model.Emp;
import shopping2.service.EmpService;
@Controller
public class EmpController {
	@Autowired
	private EmpService es;
	@RequestMapping("empList")
	public ModelAndView empList() {
		ModelAndView mav = new ModelAndView();
		List<Emp> list = es.listEmp();
		mav.addObject("list",list);
		mav.setViewName("listEmp");
		return mav;
	}
	@RequestMapping("empDetail")
	public ModelAndView empDetail(int empno) {
		ModelAndView mav = new ModelAndView();
		Emp emp = es.selectEmp(empno);
		mav.addObject("emp",emp);
		mav.setViewName("empDetail");
		return mav;
	}
}