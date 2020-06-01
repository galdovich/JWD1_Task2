package com.galdovich.day1;

public class Task7 {

    private static int x1 = 14;
    private static int y1 = 5;
    private static int x2 = 5;
    private static int y2 = -5;

    private double length1;
    private double length2;

    /** Method for outputting to the console a solution of task (start point)*/
    public void run(){
        length1 = getLength(x1, y1);
        length2 = getLength(x2, y2);
        if (areEqual(length1, length2)){
            System.out.println("Equal");
        }
        else {
            if (isFirstNearer(length1, length2)){
                System.out.println("first");
            }
            else {
                System.out.println("second");
            }
        }
    }

    private double getLength (int x, int y){
        double length = Math.sqrt(Math.abs(x*x) + Math.abs(y*x));
        return length;
    }

    private boolean isFirstNearer (double first, double second){
        if (first > second){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean areEqual (double first, double second){
        if (first != second){
            return false;
        }
        else {
            return true;
        }
    }
}
