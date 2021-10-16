package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    private int rad;

    //Constructor
    public Circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad >= 0) {
            this.rad = rad;
        }
    }

    @Override
    public double calculateArea() {
        area = Math.PI*rad*rad;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2*Math.PI*rad;
        return perimeter;
    }
}
