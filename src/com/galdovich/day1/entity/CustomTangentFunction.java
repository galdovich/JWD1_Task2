package com.galdovich.day1.entity;

public class CustomTangentFunction {
    private static final String SIGNATURE = "tg(x)";

    public String getSignature() {
        return SIGNATURE;
    }

    public double countTg(double x) {
        return Math.tan(x);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TangentFunction{");
        sb.append('}');
        return sb.toString();
    }
}
