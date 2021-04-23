# SpringBootREST_CRM
 Basically a CRUD implementation project for SpringBoot and SpringData JPA with REST functionality.
 
### What is it
- a Customer Relationship Management webapp with REST api.
- One can add a customer, update or even delete an existing one.
- Customer record has fields FirstName, LastName, and Email.
- Database used is H2. Since the intention of app is demonstration only.
- Access REST api with context path 'sbr_crm/api/employees'.

### Highlights
- Simple REST Api implementation.
- Simple record creation, updation and deletion via SpringData JPA.
- H2 for database.
- Thymeleaf and some CSS for frontend.
- Spring MVC as The Framework for app as whole.
- Maven based so it can be extended further in terms of functionality and be easily ported to any other IDEs.

### Tools required (as worked with)
| Program | Version |
| ----------| ---------|
| JDK | 8 |
| Eclipse |  2020-06 |
| Postman | 7.36.1 |
 
### How to set it up
1. Install and setup all requirements mentioned above. (Eclipse isn't a necessity, any maven based IDE should work).
2. Import project in Eclipse as Maven Project.
3. Open project from project explorer and run main java file "SpringBootRestCrmApplication.java".

### Libraries used
- Spring Boot
- Spring Web MVC
- REST
- H2
- Thymeleaf
 