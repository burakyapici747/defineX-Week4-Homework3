package com.defineXWeek4.Homework3.api.response;

public class ErrorResponse extends BaseResponse{
    public ErrorResponse(String message) {
        super(false, message);
    }
}