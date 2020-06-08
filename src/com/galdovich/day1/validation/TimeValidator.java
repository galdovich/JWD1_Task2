package com.galdovich.day1.validation;

public class TimeValidator {

    private static final int MAX_MONTH_VALUE = 12;
    private static final int MIN_VALUE = 1582;

    public static boolean checkMonth (int month){
        return month <= MAX_MONTH_VALUE && month >= MIN_VALUE;
    }

    public static boolean checkYear (int year){
        return year >= MIN_VALUE;
    }

}
