package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Figure bigCircle = new Circle(10);
        Figure smallCircle = new Circle(5);
        Figure bigRectangle = new Rectangle(5,10);
        Figure smallRectangle = new Rectangle(2,4);

        Figure[] figuresArray = new Figure[]{bigCircle, smallCircle, bigRectangle, smallRectangle};
        Calculator calc = new Calculator();
        double sumOfAllAreas = calc.calculateAreas(figuresArray);
        System.out.println("Sum of all areas is " + sumOfAllAreas);
    }
}