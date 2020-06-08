package com.galdovich.day1.service;

import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.exception.TimeException;
import com.galdovich.day1.validation.NumberValidator;
import com.galdovich.day1.validation.TimeValidator;

public class TimeService {

    public static final int SECONDS_IN_HOUR = 3600;
    public static final int MINUTES_IN_HOUR = 60;

    private enum Months {
        JANUARY(31), FEBRUARY(28), MARCH(31),
        APRIL(30), MAY(31), JUNE(30), JULY(31),
        AUGUST(31), SEPTEMBER(30), OCTOBER(31),
        NOVEMBER(30), DECEMBER(31);

        private final int days;

        private Months(int days) {
            this.days = days;
        }
    }

    /** Calculates the number of days using a given year and month, taking into account a leap year */
    public int countDaysAmount (int year, int month) throws TimeException{
        if (!TimeValidator.checkMonth(month) || !TimeValidator.checkYear(year)) {
            throw new TimeException("Incorrect values");
        }
        Months [] monthsArray = Months.values();
        int result = monthsArray [month - 1].days;
        if (isLeapYear(year) && month == 2){
            return result + 1;
        }
        return result;
    }

    /** return "true" if the year is leap */
    public boolean isLeapYear (int year){
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    /** The method returns an array of three values: hours, minutes and seconds */
    public int[] countHoursMinSec (double seconds) throws NumberException{
        if (!NumberValidator.isPositive(seconds)) {
            throw new NumberException("Number should be positive");
        }
        int [] timeArray = new int[3];
        for (int i = 0; i < timeArray.length; i++){
            switch (i){
                case 0:
                    timeArray [i] = getHours(seconds);
                    break;
                case 1:
                    timeArray [i] = getMinutes(seconds);
                    break;
                case 2:
                    timeArray [i] = getSeconds(seconds);
                    break;
            }
        }
        return timeArray;
    }

    public int getHours (double seconds){
        return (int) seconds / SECONDS_IN_HOUR;
    }

    public int getMinutes (double seconds){
        return (int)(seconds % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }

    public int getSeconds (double seconds) {
        return (int) (seconds % SECONDS_IN_HOUR) % MINUTES_IN_HOUR;
    }


}
