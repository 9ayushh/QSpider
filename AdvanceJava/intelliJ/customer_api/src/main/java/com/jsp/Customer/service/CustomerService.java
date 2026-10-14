package com.jsp.Customer.service;

import com.jsp.Customer.dto.CustomerRequestDTO;
import com.jsp.Customer.dto.CustomerResponseDTO;
import com.jsp.Customer.entity.Customer;

public interface CustomerService {

    Customer saveCustomer(CustomerRequestDTO customer);

    CustomerResponseDTO findById(int id);
    
}
