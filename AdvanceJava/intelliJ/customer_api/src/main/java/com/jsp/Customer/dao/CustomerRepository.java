package com.jsp.Customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
