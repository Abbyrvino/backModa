package com.si.apirest.security.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {
    
    private int statusCode;
    private LocalDateTime timeStamp;
    private String errorMessage;
    private String status;

}
