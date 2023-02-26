package com.defineXWeek4.Homework3.enums;

public enum DayType {
    DAILY(1),
    WEEKLY(7),
    MONTHLY(30);

    private int day;

    DayType(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
