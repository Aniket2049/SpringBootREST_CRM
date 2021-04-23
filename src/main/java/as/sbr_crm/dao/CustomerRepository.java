package as.sbr_crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import as.sbr_crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
}
