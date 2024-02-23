package com.nus.tablecheckbackend.exception;

import com.nus.tablecheckbackend.repository.SeatRepository;

public class SeatServiceException extends RuntimeException{
    public SeatServiceException(String message){
        super(message);
    }
    public SeatServiceException(String message,Throwable cause ){
        super(message,cause);
    }
}
