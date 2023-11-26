package com.techmeskills.homework_7.Task_2;

public class Triangle extends Figure {
    public String nameFigure = "Triangle";
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(String nameFigure, double sideA, double sideB, double sideC) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

//        to cheek condition existence of triangle
        if (sideA <= 0 && sideB <= 0 && sideC <= 0) {
            System.out.println("It's wrong date");
        } else if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            System.out.println("It's wrong side of triangle");
        }
    }

    @Override
    public double getAreaFigure() {

//        We can have other kind of triangles,so we'll use Theorem of Gerone's
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public double getPerimeterFigure() {
        return sideA + sideB + sideC;

    }
}
