package com.defineXWeek4.Homework3.api.response;

public class ErrorDataResponse<T> extends DataResponse<T>{

    public ErrorDataResponse(T data, String message) {
        super(data, false, message);
    }
}
