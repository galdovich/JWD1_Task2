package com.galdovich.day1;

public class Task3 {

    /** The value of the area of the outer square that sets by user */
    private static int squareArea = 23;

    /** The value of the area of the outer square that sets by user */
    private double areaInnerCircle;
    private double areaInnerArea;

    /** Method for outputting to the console a solution of task (start point)*/
    public void runTask (){
        areaInnerCircle = getAreaInnerСircle(squareArea);
        areaInnerArea = getAreaInnerSquare(areaInnerCircle);
        System.out.println("Answer is " + areaInnerArea);
        System.out.println("The area of the inscribed square is less than the area of the given square in ");
    }

    /** Method returns the value of the diameter of a circle inscribed in a "squareArea"
     * @param squareArea Square area */
    private double getAreaInnerСircle (int squareArea){
        double diameterInnerСircle = Math.sqrt(squareArea);
        return diameterInnerСircle;
    }

    /** The method returns the value of the area of a square inscribed in a circle of a given diameter
     * @param circleDiameter Circle Diameter */
    private double getAreaInnerSquare (double circleDiameter){
        double areaInnerSquare = (circleDiameter*circleDiameter)/2;
        return areaInnerSquare;
    }
}
