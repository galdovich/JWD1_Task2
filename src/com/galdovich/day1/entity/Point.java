package com.galdovich.day1.entity;

public class Point {

    private String name;
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
        this.name = "Default point";
    }

    public Point(String name, double x, double y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
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
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("( x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append(')');
        return sb.toString();
    }
}
