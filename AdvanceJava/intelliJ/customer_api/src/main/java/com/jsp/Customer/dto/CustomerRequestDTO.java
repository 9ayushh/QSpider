package com.jsp.Customer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class CustomerRequestDTO {

    private String name;
    private String email;
    private String password;
    private long phone;
}
