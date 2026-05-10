import java.util.Scanner;

public class Main {
    // My first actual Java code, hooray!
    // btw my first java comment

    // A magic spell that does no idea what
    public static void main(String[] args){

        // My first program!
        // Hello Java world!
        System.out.println("Hello World!");
        // We use + to append something inside print method
        // For example:
        // System.out.println(2 + 2);
        System.out.println("I am Bufka2011 and " + "I am learning Java!");
        // My first bug was here :D





        // Variables
        // Reusable containers for values.
        // A variable behaves as if it was the value it contains.
        // There are two data types in Java.

        // PRIMITIVE - simple value stored directly in memory (stack)
        int Integer = 15;
        double Double = 29.03;
        char Character = 'A';         // <--- SINGLE QUOTES (') ONLY!
        boolean TrueOrFalse = true;
        // byte, short, long, float, double, void and more...

        // REFERENCE - memory address (stack) that points to the (heap)
        String String = "String";
        // object
        // array

        // \n is a newline character
        System.out.print("\n\n\n");
        System.out.println("VARIABLES");
        System.out.println("The integer is " + Integer);
        System.out.println("The double is " + Double);
        System.out.println("The character is " + "\"" + Character + "\"");
        System.out.println("The TrueOrFalse is " + TrueOrFalse);
        System.out.println("The string is " + "\"" + String + "\"");





        // User input
        // We're going to accept user input using Scanner
        // One more magic spell
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\n\n");
        System.out.println("USER INPUT");

        System.out.println("What's your name?");

        // We're requesting user input and writing it into the variable
        String userName = scanner.nextLine();
        //                            ^ here after .next we should specify what kind of
        //                              data we want to accept, for example Int or Double

        System.out.println("Hi " + userName + "!, it's good to see you :)");

        // Closing scanner is considered a good practice,
        // because not doing it can cause unexpected behavior
        scanner.close();




        // If statements
        // Performs a block of code if its condition is true

        System.out.print("\n\n\n");
        System.out.println("IF STATEMENT");

        System.out.println("Enter true or false:");
        boolean ifStatement = scanner.nextBoolean();

        if(ifStatement){
            System.out.println("The statement is true");
        } else {   // <--- if the condition is not true, do something ELSE
            System.out.println("The statement is false");
        }

        scanner.close();
    }
}
