package com.galdovich.day1.console;

import com.galdovich.day1.entity.Circle;
import com.galdovich.day1.entity.Point;

import java.sql.Date;

public class PrintResult {

    public void printParametersOfSquare (double area) {
        System.out.printf("The area of the inner square: %.1f%n", area);
    }

    /**The value of the Boolean */
    public void outToConsole(boolean value) {
        System.out.printf("Answer is: " + value);
    }

    public void outToConsole(double num) {
        System.out.printf("Answer is %.3f %n", num);
    }

    public void Number (int[] array){
        System.out.println("Hours: " + array[0] + "\n" + "Minutes: " + array[1] + "\n" + "Seconds: " + array[2]);
    }

    public void printClosestPoint (Point point){
        System.out.println(point.toString());
    }

    public void printCircleArea (Circle circle){
        System.out.printf("The area of the circle: %.2f%n", circle.getCircleArea());
    }

    public void printCircleLength (Circle circle){
        System.out.printf("The length of the circle: %.2f%n", circle.getCircleLength());
    }

    public void printFunctionValue(String signature, double x, double value) {
        System.out.println("F(x) = " + signature);
        System.out.printf("F(%5.2f) = %5.9f", x, value);
    }

    public void printFunctionValues(double[][] msXAndValues) {
        for (int i = 0; i < msXAndValues[0].length; i++) {
            System.out.printf("%nF(%5.1f) = %5.2f",
                    msXAndValues[0][i],
                    msXAndValues[1][i]);
        }
    }
}
