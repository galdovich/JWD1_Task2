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


}
