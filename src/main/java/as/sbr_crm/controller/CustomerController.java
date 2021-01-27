package as.sbr_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import as.sbr_crm.entity.Customer;
import as.sbr_crm.service.CustomerService;

@Controller
public class CustomerController
{
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String CustomerList(Model model)
	{
		List<Customer> customers = customerService.GetAllCustomers();
		
		model.addAttribute("customers", customers);
		
		return "clist";
	}
	
	@GetMapping("/add")
	public String AddCustomer(Model model)
	{
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "cform";
	}
	
	@PostMapping("/save")
	public String SaveCustomer(@ModelAttribute("customer") Customer customer)
	{
		customerService.SaveCustomer(customer);
		
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String UpdateCustomer(@RequestParam("cID") int cID, Model model)
	{
		Customer customer = customerService.FindCustomerByID(cID);
		
		model.addAttribute("customer", customer);
		
		return "cform";
	}
	
	@GetMapping("/delete")
	public String DeleteCustomer(@RequestParam("cID") int cID)
	{
		customerService.DeleteCustomerByID(cID);
		
		return "redirect:/";
	}
}
