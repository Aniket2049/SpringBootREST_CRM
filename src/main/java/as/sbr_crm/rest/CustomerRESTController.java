package as.sbr_crm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import as.sbr_crm.entity.Customer;
import as.sbr_crm.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRESTController
{
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> GetAllCustomers()
	{
		return customerService.GetAllCustomers();
	}
	
	@GetMapping("/customers/{cID}")
	public Customer GetCustomerByID(@PathVariable int cID)
	{
		Customer customer = customerService.FindCustomerByID(cID);
		
		if (customer == null)
		{
			throw new RuntimeException("NO CUSTOMER WITH ID:" + cID);
		}
		
		return customer;
	}
	
	@PostMapping("/customers")
	public Customer SaveCustomer(@RequestBody Customer customer)
	{
		customerService.SaveCustomer(customer);
		
		return customer;
	}
	
	@PutMapping("/customers")
	public Customer UpdateCustomer(@RequestBody Customer customer)
	{
		customerService.SaveCustomer(customer);
		
		return customer;
	}
	
	@DeleteMapping("/customers/{cID}")
	public String DeleteCustomer(@PathVariable int cID)
	{
		Customer customer = customerService.FindCustomerByID(cID);
		if (customer == null)
		{
			throw new RuntimeException("Customer doesn't exist!");
		}
		customerService.DeleteCustomerByID(cID);
		
		return "Customer deleted with ID:" + cID;
	}
}
