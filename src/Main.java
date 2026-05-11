import java.util.Scanner;
import java.util.Random;

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

        // Closing scanner is considered a good practice,
        // because not doing it can cause unexpected behavior
        scanner.close();





        // Random numbers
        // We can generate random numbers

        System.out.print("\n\n\n");
        System.out.println("RANDOM NUMBERS");

        Random random = new Random();

        boolean isHeads;
        int randomNumber;

        // Generating a random number
        randomNumber = random.nextInt();
        System.out.println("Random number is " + randomNumber);

        // Generating a random boolean
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }





        // Mathematics
        // I HATE MATH!

        System.out.print("\n\n\n");
        System.out.println("MATHEMATICS");

        // Pi number
        System.out.println("The Pi number is " + Math.PI);

        // E number (idk what it is)
        System.out.println("The E number is " + Math.E);

        // Powers
        System.out.println("2 in power of 6 is " + Math.pow(2, 6));

        // Absolute value
        System.out.println("The absolute number of -5 is " + Math.abs(-5));

        // Square root
        System.out.println("The sqare root of 16 is " + Math.sqrt(16));

        // Round, ceil and floor
        System.out.println("The rounded number of 4.9 is " + Math.round(4.9));
        System.out.println("When rounding to the ceiling it is " + Math.ceil(4.9));
        System.out.println("When rounding to the floor it is " + Math.floor(4.9));

        // Max and min
        System.out.println("The maximum number between 1 and 10 is " + Math.max(1, 10));
        System.out.println("The minimum number between 1 and 10 is " + Math.min(1, 10));






        // printf()
        // A method used to format output
        // %[flags][width][.precision][specifier-character]

        System.out.print("\n\n\n");
        System.out.println("PRINTF()");

        String word = "Java";
        int year = 2026;
        char letter = 'A';
        int height = 160;
        double grade = 70.5;
        boolean isEmployed = false;

        System.out.printf("%s is everywhere!\n", word);
        System.out.printf("The year is %d\n", year);
        System.out.printf("The letter is %c\n", letter);
        System.out.printf("You are %dcm tall\n", height);
        System.out.printf("Your grade is %f\n", grade);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is everywhere and the year is %d\n", word, year);

        double price1 = 19.99;
        double price2 = 5.49;
        double price3 = -3.75;

        //                          v here we specify that we want to round the number to 1 decimal place
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);

        // Flags that we could use in printf:
        // + = include a plus sign for positive numbers
        // , = include a comma as a thousands separator
        // ( = enclose negative numbers in parentheses
        // space = include a space before positive numbers

        int id1 = 1;
        int id2 = 12;
        int id3 = 123;
        int id4 = 1234;

        // Padding
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);




        // String methods

        System.out.print("\n\n\n");
        System.out.println("STRING METHODS");

        String name = "Bufka2011";

        int lengthofName = name.length();
        char letterAtIndex3 = name.charAt(3);
        int index = name.indexOf('2');
        int lastIndex = name.lastIndexOf('1');

        System.out.println("My name is " + name);
        System.out.println("The length of my name is " + lengthofName);
        System.out.println("The character at index 3 is " + letterAtIndex3);
        System.out.println("The index of '2' is " + index);
        System.out.println("The last index of '1' is " + lastIndex);

        // There is also a lot of other string methods, for example:
        // toUpperCase() = converts the string to uppercase
        // toLowerCase() = converts the string to lowercase
        // trim() = removes leading and trailing whitespace
        // replace() = replaces occurrences of a substring with another substring
        // isEmpty() = checks if the string is empty
        // contains() = checks if the string contains a specific sequence of characters
        // equals() = compares two strings for equality
        // ignoreCase() = compares two strings for equality, ignoring case considerations
    }
}
