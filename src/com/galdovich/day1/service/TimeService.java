package com.galdovich.day1.service;

import com.galdovich.day1.entity.CustomTime;
import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.exception.TimeException;
import com.galdovich.day1.validation.NumberValidator;
import com.galdovich.day1.validation.TimeValidator;
import com.galdovich.day1.entity.Month;

public class TimeService {

    public static final int SECONDS_IN_HOUR = 3600;
    public static final int MINUTES_IN_HOUR = 60;

    /** Calculates the number of days using a given year and month, taking into account a leap year */
    public int countDaysAmount (int year, int month) throws TimeException{
        if (!TimeValidator.checkMonth(month) || !TimeValidator.checkYear(year)) {
            throw new TimeException("Incorrect values");
        }
        Month [] monthsArray = Month.values();
        int result = monthsArray [month - 1].getDays();
        if (isLeapYear(year) && month == 2){
            return result + 1;
        }
        return result;
    }

    /** return "true" if the year is leap */
    private boolean isLeapYear (int year){
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    /** The method returns an array of three values: hours, minutes and seconds */
    public CustomTime countHoursMinSec (double seconds) throws NumberException{
        if (!NumberValidator.isPositive(seconds)) {
            throw new NumberException("Number should be positive");
        }
        CustomTime customTime = new CustomTime();
        customTime.setHours(getHours(seconds));
        customTime.setMinutes(getMinutes(seconds));
        customTime.setSeconds(getSeconds(seconds));

        return customTime;
    }

    private int getHours (double seconds){
        return (int) seconds / SECONDS_IN_HOUR;
    }

    private int getMinutes (double seconds){
        return (int)(seconds % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }

    private int getSeconds (double seconds) {
        return (int) (seconds % SECONDS_IN_HOUR) % MINUTES_IN_HOUR;
    }


}
