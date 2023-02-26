package com.defineXWeek4.Homework3.api.response;

public abstract class BaseResponse {
    public boolean isSuccess;
    public String message;

    public BaseResponse(boolean isSuccess, String message){
        this.isSuccess = isSuccess;
        this.message = message;
    }


}