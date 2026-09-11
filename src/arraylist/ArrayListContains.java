package arraylist;

import java.util.*;

public class ArrayListContains {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(null);
        fruits.add("Cherry");
        fruits.add(null);
        fruits.add("Apple");
        fruits.add("Apple");

        fruits.add(1, "Melon");

        System.out.println("Fruits: " + fruits);

        fruits.set(1, "Mango"); //to update, modify
        System.out.println("After update: " + fruits);

        fruits.remove("Grape");
        fruits.remove("Apple"); //will remove 1st
        fruits.remove(0);
        System.out.println("After removal: " + fruits);

        System.out.println("Contains Cherry? " + fruits.contains("Cherry"));
        System.out.println("Size: " + fruits.size());

        System.out.println(fruits.indexOf("Apple") );
        System.out.println(fruits.lastIndexOf("Apple") );


        fruits.clear();
        System.out.println("Fruits after clear()" + fruits);


        ArrayList<Integer> integersList = new ArrayList<>(2);
        integersList.add( 0 );      //autoboxing
        // This zero int automatically becomes and Integer object.
        // This is called autoboxing
        integersList.add( 1 );

        integersList.add(2);

        Object[] integerArray = integersList.toArray();


        ArrayList<String> myTexts = new ArrayList<>();

        String[] arr = myTexts.toArray(new String[0]);

        myTexts.add(null);
        myTexts.add(null);
        myTexts.add(null);


    }
}