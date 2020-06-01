package com.galdovich.day1;

public class Task1 {

    /** A value that can be initialized by the constructor*/
    private static int number = 2;

    /** Method for outputting to the console a solution of task (start point)*/
    public void runTask (){
        if (checkZero(number)){
            System.out.println("The number is zero");
            return;
        }
        int theLastNumber = defineLastNumber(number);
        switch (theLastNumber){
            case 1: case 2: case 3:
                System.out.println(theLastNumber * theLastNumber);
                break;
            case 4: case 7:
                System.out.println(theLastNumber + 2);
                break;
            case 5: case 6:
                System.out.println(theLastNumber % 10);
                break;
            case 8:
                System.out.println(4);
                break;
            case 9:
                System.out.println(1);
                break;
        }
    }

    /** return "true" if the number is zero */
    private boolean checkZero (int number) {
        if (number != 0){
            return false;
        }
        return true;
    }

    /** Method that define the last number of a given number */
    private int defineLastNumber (int number){
        int lastNumber = Math.abs(number) % 10;
        return lastNumber;
    }
}
