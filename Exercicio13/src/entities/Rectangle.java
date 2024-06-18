package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(Color color, double width, double heigth) {
        super(color);
        this.width = width;
        this.height = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }

    @Override
    public double area() {
        return width * height;
    }
}
