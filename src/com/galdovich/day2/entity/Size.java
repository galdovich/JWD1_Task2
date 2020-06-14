package com.galdovich.day2.entity;

public enum Size {
    BIG(3), AVERAGE(2), SMALL(1);

    private int customSize;

    Size (int weight){
        this.customSize = weight;
    }

    public int getWeight() {
        return customSize;
    }
}
