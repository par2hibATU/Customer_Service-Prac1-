package ie.atu.week3.customer_2.Controller;

import ie.atu.week3.customer_2.Repository.customerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController {
    public customerController(customerClient client) {
        this.client = client;
    }

    private customerClient client;

    @GetMapping("/check-connection")
    public String checkConnection(){
        return client.connectionConfirmation();
    }

}
