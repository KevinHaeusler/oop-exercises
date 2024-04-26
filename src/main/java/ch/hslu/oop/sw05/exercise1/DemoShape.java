package ch.hslu.oop.sw05.exercise1;

public class DemoShape {
    public static void main(String[] arg) {
        Shape rectangle = new Rectangle(1, 4, 4, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getX());

        Shape circle = new Circle(3, 6, 2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


    }
}