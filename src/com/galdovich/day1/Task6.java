package com.galdovich.day1;

/** Идет n-я секунда суток, определить, сколько полных часов
, полных минут и секунд прошло к этому моменту. */

public class Task6 {

    /** A value that can be initialized by the constructor*/
    private static int timeSeconds = 26247347;

    /** Method for outputting to the console a solution of task (start point)*/
    public void run (){
        System.out.println(getHours(timeSeconds) + " hours "
        + getMinutes(timeSeconds) + " minutes " + getSeconds(timeSeconds) + " seconds");
    }

    private int getHours (int timeSeconds){
        int hour = timeSeconds / 3600;
        return hour;
    }

    private int getMinutes (int timeSeconds){
        int minutes = (timeSeconds % 3600) / 60;
        return minutes;
    }

    private int getSeconds (int timeSeconds) {
        int seconds = (timeSeconds % 3600) % 60;
        return seconds;
    }
}
