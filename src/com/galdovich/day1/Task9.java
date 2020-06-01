package com.galdovich.day1;

public class Task9 {

    /** A value of the circle radius.
     *  Can be initialized by the constructor*/
    private static double radius = 32.2;

    /** Variables storing the desired values of circle length and circle Area */
    private double circleLength;
    private double circleArea;

    /** Method for outputting to the console a solution of task (start point)*/
    public void run() {
        circleLength = getCircleLength(radius);
        circleArea = getCircleArea(radius);
        System.out.println("Circle Length = " + circleLength + "\n" +
                "Circle Area = " + circleArea);
    }

    /** Method calculates the length of the circle
     * @param radius Radius of a given circle */
    private double getCircleLength (double radius){
        double lenght = 2 * Math.PI * radius;
        return lenght;
    }

    /** Method calculates the area of the circle
     * @param radius Radius of a given circle */
    private double getCircleArea (double radius){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
