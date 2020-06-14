package com.galdovich.day2.entity;

public class Boll {

    private Color color;
    private Size size;
    private double weight;

    public Boll() {
        color = Color.BLACK;
        size = Size.AVERAGE;
    }

    public Boll(Color color, Size size, double weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size.getWeight();
    }

    public double getWeight(){
        return weight;
    }

    public Color getColor (){
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boll boll = (Boll) o;

        return size == boll.size && color == boll.color;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boll{");
        sb.append("color=").append(color);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
