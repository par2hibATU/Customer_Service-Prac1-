package ie.atu.week3.customer_2.Repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(name = "Product", url = "http://localhost:8080/products")
public interface customerClient {
    @GetMapping("/received")
    String connectionConfirmation();
}
