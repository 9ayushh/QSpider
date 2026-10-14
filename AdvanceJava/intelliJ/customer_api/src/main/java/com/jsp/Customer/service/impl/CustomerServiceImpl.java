package com.jsp.Customer.service.impl;

import org.springframework.stereotype.Service;

import com.jsp.Customer.dao.CustomerRepository;
import com.jsp.Customer.dto.CustomerRequestDTO;
import com.jsp.Customer.dto.CustomerResponseDTO;
import com.jsp.Customer.entity.Customer;
import com.jsp.Customer.exception.CustomerAlreadyExistException;
import com.jsp.Customer.exception.CustomerNotFoundException;
import com.jsp.Customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepo;

    @Override 
    public Customer saveCustomer(CustomerRequestDTO dto){
        if(customerRepo.existsByEmail(dto.getEmail())){
            throw new CustomerAlreadyExistException("Customer already present");
        }

        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());
        customer.setPassword(dto.getPassword());
        return customerRepo.save(customer);
    }

    public CustomerResponseDTO findById(int id) {
        Customer c = customerRepo.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found"));

        CustomerResponseDTO response = new CustomerResponseDTO();
        response.setName(c.getName());
        response.setEmail(c.getEmail());
        response.setPhone(c.getPhone());
        return response;
    }
    
}
