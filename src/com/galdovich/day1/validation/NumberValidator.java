package com.galdovich.day1.validation;

import com.galdovich.day1.entity.Point;

public class NumberValidator {

    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;

    public static boolean isZero (double number){
       return number == 0;
    }
    public static boolean isPositive (double number){
        return number >= 0;
    }
    public static boolean checkAmountOfNumbers (int [] arrayOfNumbers){
        return arrayOfNumbers.length == 4;
    }


    public static boolean checkRangePoints (Point point){
        return (point.getX() >= MIN_VALUE && point.getX() <= MAX_VALUE) &&
                (point.getY() >= MIN_VALUE && point.getY() <= MAX_VALUE);
    }


}
