package com.galdovich.day1.service;

import com.galdovich.day1.entity.Point;
import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.validation.FunctionValidator;
import com.galdovich.day1.validation.NumberValidator;

public class ArithmeticService {

    private static final int [] PERFECT_ARRAY = {6,28,496,8128,33550336};

    /** The Method finds the closest point to the coordinate start.*/
    public Point countClosestPoint (Point point1, Point point2) throws NumberException{
        if (!NumberValidator.checkRangePoints(point1) && !NumberValidator.checkRangePoints(point1)){
                throw new NumberException("Number is out of the range");
        }
        double hypod1 = point1.countVector();
        double hypod2 = point2.countVector();
        if (hypod1 > hypod2){
            return point2;
        }else {
            return point1;
        }
    }

    /** Method that define the last digit square of given number */
    public int countLastDigitSquare (double number){
        int lastDigit = (int) number % 10;
        switch (lastDigit){
            case 1: case 9:
                return 1;
            case 2: case 8:
                return 4;
            case 3: case 7:
                return 9;
            case 4: case 6:
                return 6;
            case 5:
                return 5;
            default:
                return 0;
        }
    }

    /** Return "true" if amount of even numbers more or equals two*/
    public boolean isEvenMoreTwo (int... inputArray) throws NumberException{
        if (!NumberValidator.checkAmountOfNumbers(inputArray)) {
            throw new NumberException("You must enter four numbers");
            }
        return calcEvenNumberCount(inputArray) >= 2;
    }

    /** The method calculates the number of even numbers */
    private int calcEvenNumberCount (int [] inputArray){
        int counter = 0;
        for (int number: inputArray){
            if (number % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    /** Return "true" if the number is perfect */
    public boolean isPerfect(int number) throws NumberException{
        if (!NumberValidator.isPositive(number)){
            throw new NumberException("Number is negative");
        }
        for (int num: PERFECT_ARRAY){
            return number == num;
        }
        return false;
    }

    public double countFunction(double value) {
        if (value >= 3) {
            return -Math.pow(value, 2) + 3 * value + 9;
        }
        return 1/((Math.pow(value,3)) - 6);
    }

    private double countTgFunctionValue(double x) {
        return Math.tan(x);
    }


    public double[][] countFunctionValues(double a,
                                        double b, double h) throws NumberException{
        if (!FunctionValidator.validateLineFunction(a, b, h)){
            throw new NumberException("Incorrect values. First number should be more than second number");
        }
        int size = (int) ((b - a) / h) + 1;
        double[][] msXAndValues = new double[2][size];
        int count = 0;
        for (double i = a; i < b; i += h) {
            msXAndValues[0][count] = i;
            msXAndValues[1][count++] = countTgFunctionValue(i);
        }
        return msXAndValues;
    }

}
