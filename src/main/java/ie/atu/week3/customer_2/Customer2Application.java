package ie.atu.week3.customer_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Customer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Customer2Application.class, args);
    }

}
