package classes.examples.abstrac;

public abstract class AbstractAnimal {

    String weight = "2kg";
    int age = 1;

    public void eat() {
        System.out.println("Hello, I am an abstract animal and I eat");
    }

    public String toString() {
        return "Hello my properties are... Weight:" + weight
                + "%n Age: " + age;
    }

    public abstract void move();
    public abstract void clean();
    public abstract void vaccine();
    public abstract void healthCheck();

}
