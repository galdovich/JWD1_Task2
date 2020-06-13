package com.galdovich.day1.console;

import com.galdovich.day1.entity.Circle;
import com.galdovich.day1.entity.CustomTime;
import com.galdovich.day1.entity.Point;

public class PrintResult {
    private static final String CLOSER = " closer to origin than ";
    private static final String POINTS_EQUALS = " equals ";

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

    public void outToConsole (CustomTime customTime){
        System.out.println(customTime.toString());
    }

    public void printClosestPoint(Point point1, Point point2, int flag) {
        String result;
        switch (flag) {
            case 0:
                result = point1 + POINTS_EQUALS + point2;
                break;
            case 1:
                result = point1 + CLOSER + point2;
                break;
            case 2:
                result = point2 + CLOSER + point1;
                break;
            default:
                result = "";
        }
        System.out.println(result);
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
