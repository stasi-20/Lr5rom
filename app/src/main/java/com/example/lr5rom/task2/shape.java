package com.example.lr5rom.task2;

public abstract class shape {
    protected String color;
    protected boolean filled;

    public shape() {
        color = "green";
        filled = false;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
