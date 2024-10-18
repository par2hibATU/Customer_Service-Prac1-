package ie.atu.week3.customer_2.Repository;

import ie.atu.week3.customer_2.DTO.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface customerRepo extends MongoRepository<Customer, String> {
    List<Customer> findByAge(int age);
}
