package ch09.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch09.model.Dept;
import ch09.model.DeptEmp;
import ch09.model.Emp;
import ch09.service.DeptService;
import ch09.service.EmpService;
@Controller
public class EmpController {
	@Autowired
	private EmpService es;
	@Autowired
	private DeptService ds;
	@RequestMapping("empnoChk")
	public String empnoChk(int empno,Model model) {
		Emp emp = es.select(empno);
		if  (emp==null) model.addAttribute("msg","사용 가눙한 사번입니다");
		else model.addAttribute("msg","이미 있는 사번입니다");
		return "emp/empnoChk";
	}
	@RequestMapping("empView")
	public String empView(int empno,Model model) {
		Emp emp = es.select(empno);
		model.addAttribute("emp",emp);
		return "emp/empView";
	}
	@RequestMapping("empList")
	public String empList(int deptno, Model model) {
		List<Emp> list = es.list(deptno);
		Dept dept = ds.select(deptno);
		model.addAttribute("list",list);
		model.addAttribute("dept",dept);
		return "emp/empList";
	}
	@RequestMapping("empListAll")
	public String empListAll(Model model) {
		List<DeptEmp> list = es.listAll();
		model.addAttribute("list",list);
		return "emp/empListAll";
	}
	@RequestMapping(value="insertEmp",method=RequestMethod.GET)
	public String insertEmpForm(int deptno,Model model) {
		List<DeptEmp> list = es.listAll();
		model.addAttribute("list", list);
		model.addAttribute("deptno",deptno);
		return "emp/insertEmp";
	}
	@RequestMapping(value="insertEmp",method=RequestMethod.POST)
	public String insertEmpPro(Emp emp,Model model) {
		es.insert(emp);
		return "redirect:empList.do?deptno="+emp.getDeptno();
	}
	@RequestMapping("empDelete")
	public String empDelete(int empno,int deptno) {
		es.delete(empno);
		return "redirect:empList.do?deptno="+deptno;
	}
	@RequestMapping(value="empUpdate",method=RequestMethod.GET)
	public String updateForm(int empno, Model model) {
		Emp emp = es.select(empno);
		List<DeptEmp> list = es.listAll();
		Emp emp1 = es.select(emp.getMgr());
		// 추가
		Dept dept = ds.select(emp.getDeptno());
		List<Dept> deptList = ds.list();
		//
		model.addAttribute("emp", emp);		
		model.addAttribute("list",list);
		model.addAttribute("mgrName", emp1.getEname());
		// 추가
		model.addAttribute("deptList", deptList);
		model.addAttribute("dname", dept.getDname());	
		//
		return "emp/empUpdate";
	}
	@RequestMapping(value="empUpdate",method=RequestMethod.POST)
	public String updatePro(Emp emp, Model model) {
		es.update(emp);
		return "redirect:empView.do?empno="+emp.getEmpno();
	}
}