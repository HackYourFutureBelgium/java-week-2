package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4 {
    public static void main(String[] args)
    {
        // TODO: Implement exercise

        String hello = "hello world world";

        System.out.println(hello.replace("world", "java") );

        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }


        String str2 = "Hello";
        System.out.println(str2.endsWith("lo")); // true
        System.out.println(str2);

        String hw = "hello world";
        System.out.println(hw.indexOf("o", 6) );
        System.out.println(hw.lastIndexOf("o", 6));

        String firstPart = "Hello";
        String secondPart = " World";
        System.out.println(firstPart.concat(secondPart)); // "Hello World"
        System.out.println(firstPart);

        String myString = "Hello";
        char[] arrayOfCharacters = myString.toCharArray();
        for(char c : arrayOfCharacters)
        {
            System.out.println(c);
        }


        int num = 123;
        //String.valueOf
        String usingValueOf = String.valueOf(num);
        System.out.println(usingValueOf); // "123"
    }
}

