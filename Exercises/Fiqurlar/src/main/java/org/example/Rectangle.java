package org.example;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0){
            throw new RuntimeException("width should be greater than zero");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0){
            throw new RuntimeException("height should be greater than zero");
        }
        this.length = length;
    }

    public double perimeter() {
        return 2*(width + length);
    }
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
