package com.galdovich.day2.entity;
import com.galdovich.day2.exception.NoMoreSpaceException;

import java.util.ArrayList;

public class Basket {

    private int sizeCapacity;
    private int usedSize = 0;
    private double weight;
    private ArrayList <Boll> basket;

    /** Defalt sizeCapacity equals 10*/
    public Basket (){
        this.basket = new ArrayList<>();
        this.sizeCapacity = 10;
    }

    public Basket (int sizeCapacity){
        this.sizeCapacity = sizeCapacity;
    }

    public void addBoll(Boll newBoll) throws NoMoreSpaceException{
        if (usedSize + newBoll.getSize() > sizeCapacity) {
            throw new NoMoreSpaceException();
        }else {
            basket.add(newBoll);
            usedSize += newBoll.getSize();
            weight += newBoll.getWeight();
        }
    }

    public void removeBoll (Boll removableBoll){
        if (basket.indexOf(removableBoll) == -1){
            System.out.println("There is no such ball");
        }else{
            basket.remove(removableBoll);
            weight -= removableBoll.getWeight();
            usedSize -= removableBoll.getSize();
        }
    }

    public void clean(){
        this.basket.clear();
        this.usedSize = 0;
        this.weight = 0;
    }

    public int countBlueBolls (){
        int countBLue = 0;
        for (Boll boll: basket){
            if (boll.getColor() == Color.BLUE){
                countBLue++;
            }
        }
        return countBLue;
    }

    public double showWeight(){
        return Math.round(weight);
    }

    public int showFreeSpace(){
        return sizeCapacity - usedSize;
    }



}
