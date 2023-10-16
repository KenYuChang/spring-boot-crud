package com.apidemo.spcruddemo.Service;

import com.apidemo.spcruddemo.Models.Customer;

import java.util.List;

public interface CustomerService {
    public String createCustomer(Customer customer);
    public String updateCustomer(Customer customer);
    public String deleteCustomer(String customerId);
    public Customer getCustomer(String customerId);
    public List<Customer> getAllCustomers();
}
