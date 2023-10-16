package com.apidemo.spcruddemo.Controller;
import com.apidemo.spcruddemo.Models.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class ApiController {

    Customer customer;
    @GetMapping("")
    public String getPage() {
        return "Hello World";
    }

    @GetMapping("{customerId}")
    public Customer getCustomerDetails(String customerId) {
        return customer;
    }

    @PostMapping
    public String createCustomerDetails(@RequestBody Customer customer) {
        this.customer = customer;
        return "Customer created";
    }

}
