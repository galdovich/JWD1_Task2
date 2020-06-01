package com.galdovich.day1;

public class Task5 {

    /** A value that can be initialized by constructor*/
    private static int number = 6;

    /** Variable used for count the number of numbers that make up the given number */
    private static int count;

    /** Method for outputting to the console a solution of task (start point)*/
    public void runTask() {
        if (isPerfect(number)){
            System.out.println("The number is perfect");
        }
        else {
            System.out.println("The number is not perfect");
        }
    }
    /** return "true" if the number is perfect */
    private boolean isPerfect(int number){
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                count+=i;
            }
        }
        if (count == number){
            return true;
        }
        return false;
    }
}
