package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private int height;
    private int width;

    //Constructor
    public Rectangle(int height, int width) {
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    @Override
    public double calculateArea() {
        area = height*width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (height+width)*2;
        return perimeter;
    }
}
