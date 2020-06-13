package com.galdovich.day1.service;

import com.galdovich.day1.entity.Point;
import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.validation.FunctionValidator;
import com.galdovich.day1.validation.NumberValidator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArithmeticService {

    private static final int [] PERFECT_ARRAY = {6,28,496,8128,33550336};
    private static final int FIRT_POINT_NEARER = 1;
    private static final int SECOND_POINT_NEARER = 2;
    private static final int EQUALS_POINTS = 0;

    /** Method that define the last digit square of given number */
    public int countLastDigitSquare (double number) throws NumberException{
        if (!NumberValidator.isPositive(number)){
            throw new NumberException("Number is negative");
        }
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

    /** Method returns 1 if point1 closer than point2,
     * @return 1 if first point closer than second point
     * @return 2 if second point closer than first point
     * @return 0 if distance from origin to first point and second are equals */
    public int defineClosestPoint (Point point1, Point point2) throws NumberException{
        if (!NumberValidator.checkRangePoints(point1) || !NumberValidator.checkRangePoints(point2)){
            throw new NumberException("Number is out of the range");
        }
        double point1Hypod = point1.countVector();
        double point2Hypod = point2.countVector();
        if (point1Hypod == point2Hypod) {
            return EQUALS_POINTS;
        } else if (point1Hypod > point2Hypod) {
            return SECOND_POINT_NEARER;
        }
        return FIRT_POINT_NEARER;
    }

    public double countFunction(double value) {
        if (value >= 3) {
            return Math.pow(value, 2) + 3 * value + 9;
        }
        return 1/((Math.pow(value,3)) - 6);
    }

    public SortedMap <Double, Double> countTrigonometricFunction
            (double firstPoint, double secondPoint, double functionStep) throws NumberException {
        FunctionValidator functionValidator = new FunctionValidator();

        if (!functionValidator.validateTrigFunct(firstPoint, secondPoint, functionStep)) {
            throw new NumberException();
        }

        double functionArg = firstPoint;
        SortedMap<Double, Double> functionResult = new TreeMap<>();

        while (functionArg <= secondPoint) {
            double tan = Math.tan(functionArg);
            double scale = Math.pow(10, 3);

            tan = Math.ceil(tan * scale) / scale;
            functionResult.put(functionArg, tan);
            functionArg += functionStep;
        }

        return functionResult;
    }

}
