package com.xhibit.xhibitbackend.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e){
        ErrorResponse errorResponse = new ErrorResponse(400, "Business Exception", e.getMessage());
        return ResponseEntity.badRequest().body(errorResponse);
    }
}
