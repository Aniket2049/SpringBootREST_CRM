package as.sbr_crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int    id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    
    // ----- CONSTRUCTORS -----//
    public Customer()
    {
    }
    
    public Customer(String firstName, String lastName, String email)
    {
        super();
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }
    
    public Customer(int id, String firstName, String lastName, String email)
    {
        super();
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }
    
    // ----- GETTERS AND SETTERS -----//
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    // ----- ToSTRING -----//
    @Override
    public String toString()
    {
        return "Customer [ID=" + id + ", First Name=" + firstName + ", Last Name=" + lastName + ", Email=" + email +
               "]";
    }
    
}
