package as.sbr_crm.service;

import java.util.List;

import as.sbr_crm.entity.Customer;

public interface CustomerService
{
	public List<Customer> GetAllCustomers();
	
	public Customer FindCustomerByID(int ID);
	
	public void SaveCustomer(Customer customer);
	
	public void DeleteCustomerByID(int ID);
}
