package modernjava.examples;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(0));
//        System.out.println(Integer.toBinaryString(1));
//        System.out.println(Integer.toBinaryString(2));
        //HEX: 0123456789abcdef


        Integer myInteger = 10;            // autoboxing
        int myInt = new Integer(20);       // unboxing
        int myInt2 = myInteger;             // unboxing

        Integer anInteger = null;
        int isItPossible = anInteger;   //is it possible or will it be 0 by default?
    }
}
