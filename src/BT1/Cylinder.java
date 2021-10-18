package BT1;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;

    }

    public double v() {
        return this.height * getArea();
    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

