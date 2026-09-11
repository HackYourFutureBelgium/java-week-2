package classes.examples;

/**
 * Example 3: Inheritance
 * - Superclass and Subclass
 */
public class Example3InheritanceIntroduction
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog’s own method

        Cat levi = new Cat();
        levi.eat();
        levi.meow();
        //levi.bark();        //not possible because Cat is not a Dog


        Animal anAnimal = new Animal();
        anAnimal.eat();

    }
}

// Superclass
class Animal
{
    int age;
    boolean isVertebrate;
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal            // Dog IS-A Animal
{
    int teethCount;
    public Dog() {
        //if parent class has a constructor, we must call it first
        this.teethCount = 30;
        super.age = 8;
        //super.age is same as this.age here
    }

    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meeeeoow");
    }
}

