package BT4;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getArea(1,3,5));
        System.out.println(triangle.getPerimeter(1,3,5));


    }
}
