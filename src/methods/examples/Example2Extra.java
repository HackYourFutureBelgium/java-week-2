package methods.examples;

public class Example2Extra {

    //final Integer i;  //final variables must be initialized

    public static void main(String[] args) {
        Example2 ex2 = new Example2();
        ex2.defaultMethod();
        ex2.defaultField = null;
        ex2.protectedMethod();

//        ex2.privateMethod();      //private methods are inaccesible from outside
//        staticMethod();
        ex2.finalMethod();
        ex2.synchronizedMethod();
    }
}
