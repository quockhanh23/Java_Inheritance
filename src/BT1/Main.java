package BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setColor("blue");
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(10);
        System.out.println(cylinder.v());


    }
}
