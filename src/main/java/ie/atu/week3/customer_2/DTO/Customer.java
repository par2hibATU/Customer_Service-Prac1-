package ie.atu.week3.customer_2.DTO;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Valid
    @Id
    private String id;
    @NotNull(message = "Customer Name is Mandatory")
    private String name;
    private int age;
    @NotNull(message = "Customer Email is Mandatory")
    private String email;
}
