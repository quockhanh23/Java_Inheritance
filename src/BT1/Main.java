package BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(1));
        Cylinder cylinder = new Cylinder(1, "blue", 1);
        System.out.println(cylinder.toString());


    }
}
