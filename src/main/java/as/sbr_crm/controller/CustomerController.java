package as.sbr_crm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import as.sbr_crm.entity.Customer;
import as.sbr_crm.service.CustomerService;

@Controller
public class CustomerController
{
	private CustomerService customerService;
	
	@GetMapping("/")
	public String CList(Model model)
	{
//		List<Customer> customers = customerService.GetAllCustomers();
//		
//		model.addAttribute("customers", customers);
		
		return "clist";
	}
}
