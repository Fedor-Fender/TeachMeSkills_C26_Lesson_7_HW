package com.techmeskills.homework_7.Task_2;

public class Runner {
    public static void main(String[] args) {
//        to create five kind objects of figure
        Figure[] figures = {new Circle("Circle", 7),
                new Rectangle("Rectangle", 5, 8),
                new Circle("Circle", 9),
                new Rectangle("Rectangle", 7, 9),
                new Triangle("Triangle", 6, 5, 8)};

        double sumPerimeter = 0;
        for (Figure a : figures) {
            System.out.println("|Name |: " + a.getNameFigure() +
                    "|area| = " + a.getAreaFigure() +
                    "|perimeter|= " + a.getPerimeterFigure());
            sumPerimeter += a.getPerimeterFigure();
        }
        System.out.println("Sum perimeters of figures =" + sumPerimeter);

    }
}
