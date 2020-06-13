package com.galdovich.day1.entity;

public class Circle {

    private double radius;
    private double circleArea;
    private double circleLength;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
    }

    public double getCircleArea() {
        return circleArea;
    }

    public double getCircleLength() {
        return circleLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.circleArea, circleArea) == 0 &&
                Double.compare(circle.circleLength, circleLength) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(circleArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(circleLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
