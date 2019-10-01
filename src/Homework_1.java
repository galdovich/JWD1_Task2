package PVP;

import java.util.Scanner;

public class Homework_1 {
    public static void main (String [] args){
        Task11();
    }
    public static void Task1 (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите ваш вес на Земле: ");
        double weight_Earth = scn.nextInt();
        double wight_Moon = (weight_Earth * 0.84);
        System.out.println("Ваш вес на Луне: " + wight_Moon);
    }
    public static void Task2 () {
        double[] array = {4, 5, 6, 7, 9, 11, 15};
        System.out.println("Массив до увеличения:");
        for (int x = 0; x < 7; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
        System.out.println("Массив после увеличения каждого элемента на 10%:");
        for (int x = 0; x < 7; x++) {
            double m = (array[x] + (array[x] / 10));
            System.out.print(m + " ");
        }
    }
    public static void Task3 (){
    }
    public static void Task4 (){
        for (int number = 1; number<=100; number++){
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
    public static void Task5 (){
        for (int number = 1; number<=15; number++){
            if (number%2!=0){
                System.out.println(number);
            }
        }
    }
    public static void Task6 (){
        for (int number = 2; number<=100; number = number+2){
            System.out.println(number);
        }
    }
    public static void Task7 (){
        int count = 0;
        for (int number = 20; number<=200; number++){
            count += number;
        }
        System.out.println(count);
    }
    public static void Task8 (){
        String [] mounths = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int x = 0; x<12; x++) {
            System.out.println((x+1) + " " + mounths[x]);
        }
    }
    public static void Task9 (){
        int first = 5;
        int second = 6;
        int var;
        System.out.println("Первое значение: " + first);
        System.out.println("Второе значение: " + second);
        System.out.println("-----------------");
        System.out.println("Меняем местами");
        System.out.println("-----------------");
        var = first;
        first = second;
        second = var;
        System.out.println("Первое значение: " + first);
        System.out.println("Второе значение: " + second);
    }
    public static void Task10 (){
        int first = new Scanner(System.in).nextInt();
        int second = new Scanner(System.in).nextInt();
        int third = first + second;
        System.out.println(third);
    }
    public static void Task11(){
        int first = new Scanner(System.in).nextInt();
        int second = new Scanner(System.in).nextInt();
        int third = new Scanner(System.in).nextInt();
        if (Math.max(first,second)>third){
            System.out.println(Math.max(first,third));
        }
        else
            System.out.println(third);
    }
    public static void Task12 (){
        boolean value = true;
        if (value){
            System.out.println(value + " - Истина");
        }
        value = false;
        if (value == false) {
            System.out.println(value + " - Ложь");
        }
    }
    public static void Task13 (){
        String part1 = new Scanner(System.in).nextLine();
        String part2 = new Scanner(System.in).nextLine();
        String common = part1 + part2;
        System.out.println(common);
    }
    public static void Task14 (){
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        if(number1>number2) {
            number1 +=3;
            System.out.println(number1);
            System.out.println(number2);
        }
        else {
            number2 +=8;
            System.out.println(number1);
            System.out.println(number2);
        }
    }
    public static void Task15 (){
        for (int x=0; x<=100; x++){
            System.out.println(x);
        }
        int y = 1;
        while (y<=100){
            System.out.println(y);
            y++;
        }
        int z = 1;
        do {
            z++;
            System.out.println(z);
        }
        while(z<=99);
    }
    public static void Task16 (){
        System.out.println("Введите min знычение: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println("Введите max знычение: ");
        int max = new Scanner(System.in).nextInt();
        System.out.println("Введите интервал: ");
        int interval = new Scanner(System.in).nextInt();
        for (int a = min; a <=max; a+=interval){
            System.out.println(a);
        }
    }
    public static void Task17 (){
        double [] array = {1,5,6,7,3,9,3,1};
        double indexOfMax = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > indexOfMax){
                indexOfMax = array[i];
            }
        }
        System.out.println("Максимальное число: " + indexOfMax);
        for (int p = 0; p < array.length; p++){
            double number = array[p]/indexOfMax;
            System.out.println(number);
        }
    }
    public static void Task18 (){
        int blr = 15;
        double blr_rus = 3.41;
        double rus = blr*blr_rus;
        System.out.println(rus);
    }
    public static void Task19 (){
        int hours  = 24;
        int minuts = 60;
        int seconds = 60;
        int days = new Scanner(System.in).nextInt();
        System.out.println("In" + days + " - " + (hours*days) + " hours, " + minuts*hours*days + " minutes, " + minuts*hours*days*seconds + " seconds!");
    }
}
