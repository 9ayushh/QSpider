package com.jsp.Customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Customer.dto.CustomerRequestDTO;
import com.jsp.Customer.dto.CustomerResponseDTO;
import com.jsp.Customer.entity.Customer;
import com.jsp.Customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController 
@RequestMapping ("/customers")
@RequiredArgsConstructor 
public class CustomerController {
    
    private final CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerRequestDTO customer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.saveCustomer(customer));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<CustomerResponseDTO> getMethodName(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerService.findById(id));
    }
    
    
}
