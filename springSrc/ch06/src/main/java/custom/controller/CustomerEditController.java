package custom.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import custom.model.Customer;
import custom.service.CustomerService;
@Controller
@RequestMapping("customer/{customerId}")
@SessionAttributes("editCustomer")
public class CustomerEditController {
	@Autowired
	private CustomerService cs;
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public String edit(@PathVariable int customerId, Model model ) {
		Customer customer = cs.select(customerId);
		model.addAttribute("editCustomer", customer);
		return "redirect:enter";
	}
	@RequestMapping(value="/enter",method=RequestMethod.GET)
	public String enter(@ModelAttribute("editCustomer") 
			Customer customer,Model model ) {
		return "customer/edit/enter";
	}
	@RequestMapping(value="/enter",params="_event_proceed")
	public String proceed(@Valid @ModelAttribute("editCustomer") 
			Customer customer,Errors errors ) {
		if (errors.hasErrors()) return "customer/edit/enter";
		else return "redirect:review";
	}
	@RequestMapping(value="/review",method =RequestMethod.GET)
	public String showReview(@ModelAttribute("editCustomer") 
		Customer customer) {
		return "customer/edit/review";
	}
	@RequestMapping(value="/review",params="_event_revise",
			method=RequestMethod.POST)
	public String revise() {
		return "redirect:enter";
	}
	@RequestMapping(value="/review",params="_event_confirmed", 
			method=RequestMethod.POST)
	public String edit(@ModelAttribute("editCustomer") 
		Customer customer,RedirectAttributes redirectAttributes, 
		SessionStatus sessionStatus)	 {
		cs.update(customer);
		redirectAttributes.addFlashAttribute("editedCustomer",customer);
		sessionStatus.setComplete(); 
		return "redirect:/list";
	}
	@RequestMapping(value="/edited",method=RequestMethod.GET)
	public String showEdited(@ModelAttribute("editCustomer")
		Customer customer, SessionStatus sessionStatus) {
		sessionStatus.setComplete(); 
		return "customer/edit/edited";
	}
}