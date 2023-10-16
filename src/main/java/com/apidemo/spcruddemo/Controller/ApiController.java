package com.apidemo.spcruddemo.Controller;
import com.apidemo.spcruddemo.Models.Customer;
import com.apidemo.spcruddemo.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class ApiController {

    CustomerService customerService;

    public ApiController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/page")
    public String getPage() {
        return "Hello World";
    }

    @GetMapping("{customerId}")
    public Customer getCustomerDetails(@PathVariable("customerId") String customerId) {
        return customerService.getCustomer(customerId);
    }
    @GetMapping()
    public List<Customer> getAllCustomerDetails() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public String createCustomerDetails(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return "Customer created";
    }
    @PutMapping
    public String updateCustomerDetails(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return "Customer updated";
    }
    @DeleteMapping("{customerId}")
    public String deleteCustomerDetails(@PathVariable("customerId") String customerId) {
        customerService.deleteCustomer(customerId);
        return "Customer deleted";
    }
}
