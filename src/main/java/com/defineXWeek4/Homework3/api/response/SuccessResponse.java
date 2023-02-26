package com.defineXWeek4.Homework3.api.response;

public class SuccessResponse extends BaseResponse{

    public SuccessResponse(String message) {
        super(true, message);
    }
}