package com.galdovich.day1.service;

import com.galdovich.day1.entity.Circle;
import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.validation.NumberValidator;

public class FigureService {

    /** Calculates the area of a square inscribed in a circle */
    public double calcInnerSquareArea(double outerSquareArea) throws NumberException {
        if (!NumberValidator.isPositive(outerSquareArea) || NumberValidator.isZero(outerSquareArea)) {
            throw new NumberException("Incorrect value");
        }
        double squareSide = countSquareSide(outerSquareArea);
        return countSquareArea(squareSide);
    }

    /** The method returns the value of the side of the square */
    public static double countSquareSide (double squareArea){
        return Math.sqrt(squareArea);
    }

    /** The method returns the square area calculated using the diagonal
     * @param diagonal diagonal of a square */
    public static double countSquareArea (double diagonal){
        return Math.pow(diagonal,2)/2;
    }

    /** Method returns an object with an initialized field "circleLength */
    public Circle countCircleLength(Circle circle) throws NumberException{
        if(!NumberValidator.isPositive(circle.getRadius())){
            throw new NumberException("Must be positive");
        }
        double circleLength = 2 * Math.PI * circle.getRadius();
        circle.setCircleLength(circleLength);
        return circle;
    }
    /** Method returns an object with an initialized field "circleArea */
    public Circle countCircleArea(Circle circle) throws NumberException{
        if(!NumberValidator.isPositive(circle.getRadius())){
            throw new NumberException("Must be positive");
        }
        double circleArea = Math.PI * Math.pow(circle.getRadius(), 2);
        circle.setCircleArea(circleArea);
        return circle;
    }


}
