package com.techmeskills.homework_7.Task_2;

public class Circle extends Figure {
    public String nameFigure = "Circle";
    public double radius;

//    to create constructor
    public Circle(String nameFigure, double radius) {
        this.nameFigure = nameFigure;
        this.radius = radius;
    }
//    to create method of getting area of circle based on abstract method
    @Override
    public double getAreaFigure() {
        if (radius != 0) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
    //    to create method of getting perimeter of circle based on abstract method
    @Override

    public double getPerimeterFigure() {
        if (radius != 0) {
             return  2 * Math.PI * radius;
        }
        return 0;
    }
    public String getNameFigure() {
        return nameFigure;
    }
}
