package com.example.lr5rom.task1;

public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle() {
        length = 3.2;
        width = 4.5;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "The Rectangle with color: " + getColor() + ", area: " +  getArea();
    }


}
