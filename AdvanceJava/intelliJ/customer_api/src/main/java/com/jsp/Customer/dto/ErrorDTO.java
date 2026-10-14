package com.jsp.Customer.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class ErrorDTO {
    
    private HttpStatus status;
    private String message;
}
