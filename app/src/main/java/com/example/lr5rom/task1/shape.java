package com.example.lr5rom.task1;

abstract public class shape {

    private String color;

        public shape()
        {
            color = "Red";
        }

        public shape(String color)
        {
            this.color = color;
        }

        public String getColor()
        {
            return color;
        }

        @Override
        public String toString()
        {
            return "The shape with color: " + color;
        }

        abstract public double getArea();
}

