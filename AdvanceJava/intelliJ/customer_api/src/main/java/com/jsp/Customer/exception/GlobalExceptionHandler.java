package com.jsp.Customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.Customer.dto.ErrorDTO;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    
    @ExceptionHandler (CustomerAlreadyExistException.class)
    public ResponseEntity<ErrorDTO> handleCustomerException (CustomerAlreadyExistException e) {
        ErrorDTO dto = new ErrorDTO();
        dto.setStatus(HttpStatus.BAD_REQUEST);
        dto.setMessage("Customer Already Exists");
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dto);
    }
}
