package com.galdovich.day1.entity;

public class Point {

    private String name;
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
        this.name = "Default point";
    }

    public Point(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double countVector() {
        return Math.hypot(this.x, this.y);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Point point = (Point) o;
        if (x != point.x){
            return false;
        }

        if (y != point.y){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Point - %s, coordinate X = %d, coordinate Y = %d", name, x, y);
    }
}
