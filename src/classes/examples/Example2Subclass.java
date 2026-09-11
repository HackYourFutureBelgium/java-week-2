package classes.examples;


//This example shows about protected method accesibility

public class Example2Subclass extends methods.examples.Example2 {

    public static void main(String[] args) {
        Example2Subclass iAm = new Example2Subclass();
        iAm.protectedMethod();

    }
}
