package com.galdovich.day1;

public class Task4 {

    /** An array that can be initialized by the constructor*/
    private static int [] arrayOfNumbers = {3,4,1,4};

    /** variable for counting the number of even numbers */
    private static int count = 0;


    /** method for outputting to the console a solution of task (start point) */
    public void runTask (){
        if (checkAmountOfNumbers(arrayOfNumbers)) {
            getCountEvenNumber(arrayOfNumbers);
            if (count >= 2) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        else {
            System.out.println("Not enough numbers in the array");
        }
    }

    /** method for counting the number of even numbers */
    private void getCountEvenNumber (int [] arrayOfNumbers){
        for (int numberOfArray: arrayOfNumbers){
            if(Math.abs(numberOfArray) % 2 == 0){
                count ++;
            }
        }
    }

    /** return "true" if the number of numbers in the array is more than four */
    private boolean checkAmountOfNumbers (int [] arrayOfNumbers){
        if (arrayOfNumbers.length < 4){
            return false;
        }
        return true;
    }

}
