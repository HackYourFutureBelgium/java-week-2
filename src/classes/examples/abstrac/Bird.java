package classes.examples.abstrac;

public class Bird extends AbstractAnimal {

    public Bird() {
        super();
        this.age = 0;
        this.weight = "1 kg";
    }

    public void move() {
        System.out.println("I fly");
    }

    public void clean() {
        System.out.println("Birds clean themselves");
    }

    public void vaccine() {
        System.out.println("We have a pharmacist for birds");
    }

    public void healthCheck() {
        System.out.println("Our veterinarian can health check birds");
    }

}
