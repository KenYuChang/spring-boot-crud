package com.apidemo.spcruddemo.Controller;
import com.apidemo.spcruddemo.Models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class ApiController {

    @GetMapping("")
    public String getPage() {
        return "Hello World";
    }

    @GetMapping("{customerId}")
    public Customer getCustomerDetails(String customerId) {
        return new Customer("C1",
                "Ken", "Taipei", "0952789345");
    }
}
