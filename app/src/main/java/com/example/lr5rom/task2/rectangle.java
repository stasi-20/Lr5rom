package com.example.lr5rom.task2;

public class rectangle extends shape{
    protected double width;
    protected double length;

    public rectangle() {
        width = 3.2;
        length = 5.3;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "The rectangle with color: " + getColor() + ", width: " + width + ", length: " + length
                + ", Area: " + getArea() + ", perimeter: " + getPerimeter() + ", filled status: " + isFilled();
    }
}
