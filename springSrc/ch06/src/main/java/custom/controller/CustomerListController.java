package custom.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import custom.model.Customer;
import custom.service.CustomerService;
@Controller
public class CustomerListController {
	@Autowired
	private CustomerService cs;
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String customer(Model model) {
		List<Customer> list = cs.list();
		model.addAttribute("list",list);
		return "customer/list";
	}
	@RequestMapping(value="customer/{customerId}",method=RequestMethod.GET)
	public String detail(@PathVariable int customerId, Model model) {
		Customer customer = cs.select(customerId);
		model.addAttribute("customer",customer);
		return "customer/detail";
	}
}