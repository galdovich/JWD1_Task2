package com.galdovich.day1;

public class Task2 {

    /** A values that can be initialized by the constructor*/
    private static int year = 1999;
    private static int month = 2;

    /** Variable for counting amount of days in a given month */
    private static int days;

    /** Variable to determine the leap year */
    private boolean isLeap;

    /** Method for outputting to the console a solution of task (start point)*/
    public void runTask (){
        days = getAmountOfDays(month, year);
        System.out.println("Year = " + year +"\n" +
                "Month = " + month + "\n" +
                "Amount of days = " + days + "\n" +
                "Leap = " + isLeap);
    }

    /** Method for calculating the number of days in a give "month" and "year" */
    private int getAmountOfDays (int month, int year){
        switch (month){
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               days = 31;
               break;
           case 4: case 6: case 9: case 11:
               days = 30;
               break;
           case 2:
               if (isLeapYear(year)){
                   days = 29;
                   break;}
               else {
                   days = 28;
                   break;
               }
       }
       return days;
    }

    /** return "true" if the year is leap */
    private boolean isLeapYear (int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
