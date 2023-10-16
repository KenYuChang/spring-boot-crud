package com.apidemo.spcruddemo.Respository;

import com.apidemo.spcruddemo.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
