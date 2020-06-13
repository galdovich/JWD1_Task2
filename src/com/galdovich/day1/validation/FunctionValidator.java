package com.galdovich.day1.validation;

public class FunctionValidator {

    public boolean validateTrigFunct(double firstPoint, double secondPoint, double functionStep) {
        boolean result = true;

        if (firstPoint > secondPoint && functionStep > 0) {
            result = false;
        } else if (firstPoint < secondPoint && functionStep < 0) {
            result = false;
        } else if (Math.abs(firstPoint - secondPoint) < functionStep) {
            result = false;
        }

        return result;
    }
}
