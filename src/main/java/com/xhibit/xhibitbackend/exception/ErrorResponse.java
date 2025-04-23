package com.xhibit.xhibitbackend.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class ErrorResponse {
    private int statusCode;
    private String errorType;
    private String message;
    private String timeStamp;
    public ErrorResponse(int statusCode, String errorType, String message) {
        this.statusCode = statusCode;
        this.errorType = errorType;
        this.message = message;
        this.timeStamp = LocalTime.now().toString();
    }
}
