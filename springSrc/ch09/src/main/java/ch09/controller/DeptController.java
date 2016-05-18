package ch09.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch09.dao.EmpDao;
import ch09.model.Dept;
import ch09.model.Emp;
import ch09.service.DeptService;
import ch09.service.EmpService;
@Controller
public class DeptController {
	@Autowired
	private DeptService ds;
	@Autowired
	private EmpService es;
	@RequestMapping("deptList")
	public String deptList(Model model) {
		List<Dept> list = ds.list();
		model.addAttribute("list", list);
		return "dept/deptList";
	}
	@RequestMapping(value="deptInsert",method=RequestMethod.GET)
	public String deptInsertForm(){
		return "dept/deptInsert";
	}
	@RequestMapping(value="deptInsert",method=RequestMethod.POST)
	public String deptInsert(Dept dept){
		ds.insert(dept);
		return "redirect:deptList.do";
	}
	@RequestMapping("deptnoCheck")
	public String deptnoCheck(int deptno,Model model) {
		Dept dept = ds.select(deptno);
		if (dept==null) model.addAttribute("msg","�궗�슜媛��뒫�븳 遺��꽌肄붾뱶");
		else model.addAttribute("msg","�떎瑜� 遺��꽌肄붾뱶瑜� �궗�슜�븯�떆�삤");
		return "dept/deptnoChk";
	}
	@RequestMapping("delete")
	public String delete(int deptno,Model model) {
		List<Emp> list = es.list(deptno);
		if (list.size()!=0)  {
			model.addAttribute("msg","�궘�젣�븷 �닔 �뾾�뒗 遺��꽌�엫");
			return "forward:deptList.do";
		} else {
			ds.delete(deptno);
			return "redirect:deptList.do";
		}		
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String updateForm(int deptno,Model model) {
		Dept dept = ds.select(deptno);
		model.addAttribute("dept", dept);
		return "dept/update";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(Dept dept,Model model) {
		ds.update(dept);
		return "redirect:deptList.do";
	}
}