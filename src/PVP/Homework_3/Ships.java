package PVP.Homework_3;

import java.util.Objects;

public class Ships{

    private String application; // military or civil
    private String name;
    private int passengers;
    private double length;
    private int maxSpeed;

    // constructor 1
    public Ships(String application, String name, int passengers, double length, int maxSpeed) {
        this.application = application;
        this.name = name;
        this.passengers = passengers;
        this.length = length;
        this.maxSpeed = maxSpeed;
    }

    // constructor 2
    public Ships() {

    }

    // Getters and Setters
    public String getApplication() {
        return application;
    }
    public void setApplication(String application) {
        this.application = application;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // переопределение метода toString
    public String toString() {
        return " Применение: " + application + "\n Имя: " + name + "\n Вместимость: " + passengers + "\n Длинна: " + length + "\n Максимальная скорость: " + maxSpeed;
    }

    // переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ships ships = (Ships) o;
        return passengers == ships.passengers &&
                Double.compare(ships.length, length) == 0 &&
                Double.compare(ships.maxSpeed, maxSpeed) == 0 &&
                Objects.equals(application, ships.application) &&
                Objects.equals(name, ships.name);
    }
    // переопределение метода hashcode
    @Override
    public int hashCode() {
        return Objects.hash(application, name, passengers, length, maxSpeed);
    }
}


