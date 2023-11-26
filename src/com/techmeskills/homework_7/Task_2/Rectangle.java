package com.techmeskills.homework_7.Task_2;

public class Rectangle extends Figure {
    public String nameFigure = "Rectangle";
    public double width;
    public double length;

    public Rectangle(String nameFigure, double width, double length) {

        this.nameFigure = nameFigure;
        this.width = width;
        this.length = length;

    }

    @Override
    public double getAreaFigure() {
        if (width != 0 && length != 0) {
            return width * length;
        }
        return 0;
    }

    @Override
    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public double getPerimeterFigure() {
        if (width != 0 && length != 0)
            return 2 * (width + length);
        return 0;
    }
}
