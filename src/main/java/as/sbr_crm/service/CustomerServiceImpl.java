package as.sbr_crm.service;

import as.sbr_crm.dao.CustomerRepository;
import as.sbr_crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Customer           customer    = null;
        Optional<Customer> queryResult = customerRepository.findById(ID);
        
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
