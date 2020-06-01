package com.galdovich.day1;

public class Task8 {

    private static int X = 4;

    /** Method for outputting to the console a solution of task (start point)*/
    public void run () {
        if (X >= 3) {
            double f = Math.pow(-X,2) + 3*X + 9;
            System.out.println(f);
        }
        else {
            double f = 1/((Math.pow(X,3)) - 6);
            System.out.println(f);
        }
    }
}
