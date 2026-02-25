package classes.examples.polymorphism;


import classes.examples.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        //Shape s = new Shape();
        Shape s = new Square(); //Polimorphic object creation
        Triangle t1 = new Triangle();
        t1.equals(s);
    }

    public int write(Shape shape) { //the parameter type is Shape, so any subclass of shape are welcome here
        shape.draw();
        return 0;
    }
}
