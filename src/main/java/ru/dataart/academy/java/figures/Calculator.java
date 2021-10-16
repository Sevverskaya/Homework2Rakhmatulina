package ru.dataart.academy.java.figures;

public class Calculator {

    public double calculateAreas(Figure[] figuresArray) {
        double areasSum = 0;

        for (int i = 0; i < figuresArray.length; i++) {
            areasSum += figuresArray[i].calculateArea();
        }

        return areasSum;

    }

}
