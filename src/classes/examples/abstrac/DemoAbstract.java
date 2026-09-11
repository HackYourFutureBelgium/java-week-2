package classes.examples.abstrac;

public class DemoAbstract {

    public static void main(String[] args) {
        Bird tweety = new Bird();
        System.out.println("Age: " + tweety.age);
        System.out.println("Weight: " + tweety.weight);
        tweety.eat();   //eat method was defined in abstract class
        tweety.move();
    }
}
