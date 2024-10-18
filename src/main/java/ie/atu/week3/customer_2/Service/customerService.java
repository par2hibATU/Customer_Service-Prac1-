package ie.atu.week3.customer_2.Service;

import ie.atu.week3.customer_2.DTO.Customer;
import ie.atu.week3.customer_2.Repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class customerService {
    public customerService(customerRepo repo) {
        this.repo = repo;
    }
    @Autowired
    private customerRepo repo;

    public Customer addCustomer(Customer customer){
        customer.setId(UUID.randomUUID().toString().split("-")[0]);
        return repo.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return repo.findAll();
    }

    public List<Customer> getCustomerByAge(int age){
        return repo.findByAge(age);
    }

    public Customer getCustomerById(String id){
        return repo.findById(id).get();
    }

    public Customer updatedCustomer(String id, Customer customer){
        Optional<Customer> queryCustomer = repo.findById(id);
        if(!queryCustomer.isPresent()){
            throw new RuntimeException("Customer Not Found");
        }
        Customer existingCustomer = queryCustomer.get();
        existingCustomer.setAge(customer.getAge());
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        return repo.save(existingCustomer);
    }


}
