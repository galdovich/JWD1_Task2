package com.galdovich.day1.validation;

public class FunctionValidator {

    public static boolean validateLineFunction(double firstPoint, double secondPoint, double step) {

        if (firstPoint > secondPoint) {
            return false;
        }
        if (secondPoint - firstPoint < step) {
            return false;
        }
        if (step < 0) {
            return false;
        }
        return true;
    }
}
