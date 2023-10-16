package com.apidemo.spcruddemo.Service.impl;

import com.apidemo.spcruddemo.Models.Customer;
import com.apidemo.spcruddemo.Respository.CustomerRepository;
import com.apidemo.spcruddemo.Service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String createCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Success";
    }

    @Override
    public String updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Success";
    }

    @Override
    public String deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
        return "Success";
    }

    @Override
    public Customer getCustomer(String customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
