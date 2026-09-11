import java.util.Scanner;

public class Project1InputHelper {

    private static final Scanner myScanner = new Scanner(System.in);

    public static int readInt() {
        while (true) {
            if (myScanner.hasNextInt()) {
                int value = myScanner.nextInt();
                myScanner.nextLine(); // consume the rest of the line
                return value;
            }

            myScanner.nextLine(); // discard the invalid input
            System.out.print("Invalid number. Please enter an integer: ");
        }
    }

    public static int readInt(String message) {   //method overloading
        System.out.print(message);
        return readInt();
    }

    public static double readDouble() {
        while (true) {
            if (myScanner.hasNextDouble()) {
                double value = myScanner.nextDouble();
                myScanner.nextLine(); // consume the rest of the line
                return value;
            }

            myScanner.nextLine(); // discard the invalid input
            System.out.print("Invalid number. Please enter a decimal number: ");
        }
    }

    public static double readDouble(String message) {   //method overloading
        System.out.print(message);
        return readDouble();
    }

    public static char readChar() {
        while (true) {
            String input = myScanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input.charAt(0);
            }

            System.out.print("Please enter a character: ");
        }
    }

    public static char readChar(String message) {
        System.out.print(message);
        return readChar();
    }

    public static String readString() {
        return myScanner.nextLine();
    }

    public static String readString(String message) {
        System.out.print(message);
        return readString();
    }

    public static void close() {
        myScanner.close();
    }
}
