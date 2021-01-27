package as.sbr_crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import as.sbr_crm.dao.CustomerRepository;
import as.sbr_crm.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> GetAllCustomers()
	{
		return customerRepository.findAll();
	}
	
	@Override
	public Customer FindCustomerByID(int ID)
	{
		Customer			customer	= null;
		Optional<Customer>	queryResult	= customerRepository.findById(ID);
		
		if (queryResult.isPresent())
		{
			customer = queryResult.get();
		}
		else
		{
			throw new RuntimeException("No Customer with ID:" + ID);
		}
		
		return customer;
	}
	
	@Override
	public void SaveCustomer(Customer customer)
	{
		customerRepository.save(customer);
	}
	
	@Override
	public void DeleteCustomerByID(int ID)
	{
		customerRepository.deleteById(ID);
	}
	
}
