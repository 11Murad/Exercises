package org.example;

public class Parallelepiped extends Rectangle {
    private double height;

    public Parallelepiped(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            throw new RuntimeException("Height must be a positive number");
        }
        this.height = height;
    }

    public double perimeter() {
        return super.perimeter() * 2 + 4 * getWidth();
    }
    public double area() {
        return 2 * (getWidth() * getLength()+getWidth()*getHeight()+getLength()*getHeight());
    }
    public double volume() {
        return getWidth() * getHeight() * getLength();
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height + super.toString() +
                '}';
    }
}
