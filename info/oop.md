# Object-Oriented Programming (OOP)

Java is an **Object-Oriented Programming (OOP)** language. OOP focuses on **objects** that combine **data** and **behavior**.
Java implements OOP principles to make programs **modular, reusable, and maintainable**.

---

## 1. Classes and Objects

### Class
A **class** is a blueprint or template for creating objects. It defines:
- **Attributes (fields)** → data of the object
- **Methods** → behavior/functions of the object

```java
class Car 
{
    String color;
    String model;
    int year;

    void start() 
    {
        System.out.println(model + " is starting.");
    }
}
````

### Object

An **object** is an instance of a class.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        Car myCar = new Car(); // Object creation
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2023;
        myCar.start();
    }
}
```

---

## 2. Four Main OOP Principles in Java

### 2.1 Encapsulation

**Encapsulation** is the practice of **hiding internal details** of an object and exposing only what is necessary.

* Achieved using **private fields** and **public getters/setters**.

```java
class Person 
{
    private String name;
    private int age;

    // Getter
    public String getName() 
    {
        return name;
    }

    // Setter
    public void setName(String name) 
    {
        this.name = name;
    }
}
```

---

### 2.2 Inheritance

**Inheritance** allows a class to **inherit properties and methods** from another class.

* The **superclass** is the parent class.
* The **subclass** is the child class.

```java
class Vehicle 
{
    void start() 
    {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle 
{
    void ringBell() 
    {
        System.out.println("Bike bell rings!");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Bike myBike = new Bike();
        myBike.start();   // Inherited from Vehicle
        myBike.ringBell(); // Own method
    }
}
```

---

### 2.3 Polymorphism

**Polymorphism** means **many forms**. It means that Java can use the same
method name in different situations and choose the appropriate behavior.

In Java, it occurs in two common types:

1. **Compile-time polymorphism (Method Overloading)**: Same method name,
   different parameter lists.

```java
class Calculator 
{
    int add(int a, int b) 
    { 
        return a + b; 
    }
    double add(double a, double b) 
    { 
        return a + b; 
    }
}
```

This is polymorphism because the same method name, `add`, has different forms:

```java
Calculator calculator = new Calculator();

calculator.add(2, 3);       // Java uses add(int, int)
calculator.add(2.5, 3.5);   // Java uses add(double, double)
```

Java chooses the correct form from the arguments, before the program runs.
That is why it is called **compile-time polymorphism**.

2. **Runtime polymorphism (Method Overriding)**: A subclass provides its own
    implementation of a method inherited from its parent class.

```java
class Animal 
{
    void sound() 
    { 
        System.out.println("Animal sound"); 
    }
}

class Dog extends Animal 
{
    void sound() 
    { 
        System.out.println("Dog barks"); 
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Animal animal = new Dog();
        animal.sound(); // Dog barks
    }
}
```

Here, the variable type is `Animal`, but the actual object is a `Dog`.
Java waits until the program runs to choose the correct `sound()` method.
Because the object is a `Dog`, it calls `Dog`'s version. This is called
**runtime polymorphism**.

---

### 2.4 Abstraction

**Abstraction** hides implementation details and shows only functionality.

* Achieved using **abstract classes** or **interfaces**.

```java
abstract class Shape 
{
    abstract void draw();
}

class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Circle");
    }
}
```

---

## 3. Additional OOP Features in Java

### 3.1 Interfaces

* Define **methods without implementation**.
* Classes **implement interfaces** and provide method definitions.

```java
interface Animal 
{
    void eat();
}

class Cat implements Animal 
{
    public void eat() 
    {
        System.out.println("Cat is eating");
    }
}
```

### 3.2 Constructors

* Special methods used to **initialize objects**.

```java
class Person 
{
    String name;
    Person(String name) 
    {
        this.name = name;
    }
}
```

### 3.3 `this` and `super` Keywords

* `this` → Refers to **current object**.
* `super` → Refers to the **parent class object**. Use it to access a parent
  class field or method when a child class has a member with the same name.
* `super()` → Calls the constructor of the parent class. It must be the first
  statement in a child class constructor.

### `super` Example

```java
class Vehicle
{
    String type = "vehicle";
}

class Bike extends Vehicle
{
    String type = "bike";

    void printTypes()
    {
        System.out.println(type);       // bike: field in Bike
        System.out.println(super.type); // vehicle: field in Vehicle
    }
}
```

### `super()` Example

```java
class Vehicle
{
    String brand;

    Vehicle(String brand)
    {
        this.brand = brand;
    }
}

class Bike extends Vehicle
{
    int numberOfWheels;

    Bike(String brand, int numberOfWheels)
    {
        super(brand); // Calls Vehicle's constructor first.
        this.numberOfWheels = numberOfWheels;
    }
}
```

In this example, `super(brand)` gives the `brand` value to the `Vehicle`
constructor. If the parent class has a constructor with parameters, the child
class must call a matching parent constructor with `super(...)`.

---

## 4. Advantages of OOP in Java

* **Modularity** → Code is organized into classes.
* **Reusability** → Use existing classes through inheritance.
* **Maintainability** → Easy to update or fix code.
* **Scalability** → Easier to add new functionality.

---

## 5. Summary Table of OOP Concepts

| Concept       | Description                                   | Example                      |
|---------------|-----------------------------------------------|------------------------------|
| Class         | Blueprint of an object                        | `class Car {}`               |
| Object        | Instance of a class                           | `Car myCar = new Car();`     |
| Encapsulation | Hiding data using private fields              | Getters/Setters              |
| Inheritance   | Subclass inherits from superclass             | `class Bike extends Vehicle` |
| Polymorphism  | One name, many forms (overloading/overriding) | `add()` method or `sound()`  |
| Abstraction   | Hiding implementation, exposing functionality | Abstract class / Interface   |

---

