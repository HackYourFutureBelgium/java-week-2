package classes.examples.polymorphism;

public class Rectangle extends Shape {

    public void draw() {
        System.out.println("Rectangle is the latest");
    }

    @Override
    public void sketch() {

    }

    public void rectangleSpecific() {
        System.out.println("Sum of my inside angles are 360 degrees.");
    }

}
