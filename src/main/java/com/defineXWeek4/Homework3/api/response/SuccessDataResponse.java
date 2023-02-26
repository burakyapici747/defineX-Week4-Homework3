package com.defineXWeek4.Homework3.api.response;

public class SuccessDataResponse<T> extends DataResponse<T>{
    public SuccessDataResponse(T data, String message) {
        super(data, true, message);
    }
}