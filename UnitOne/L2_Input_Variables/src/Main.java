import java.util.Scanner;
/*
To read the user input, we need to import a utility class at the top of our file,
and parse them into primitive data types (int, double, or String)
 */
public class Main {
    public static void main(String[] args) {
        /*
        Input is the data or information the program receives.
        To work, a memory spot needs to be set up to hold the information. We know as variable.
        */

        //Declare or create your variables in memory
        Scanner userInput = new Scanner(System.in);
        // "=" is the assignment operator. Assigns the value from right to left
        String color; //Declare. This variable is not initialized
        // "String" refers to the data type, and "color" is the variable name
        /*
        About variables:
        - holds a memory spot in the computer
        - value can change or update as many times we want
        - the name we assign to the variables can help us to understand our program
        - String types take more space in memory because each letter stores in its own box of memory
          and the variable name(place in memory) is the road map that java uses to gather all letters of variable

        Variables rules:
        - name can't have spaces
        - name can't have numbers
        - name can't be any of the Java reserve keywords
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
         */

        System.out.println("What is your favorite color?");
        color = userInput.nextLine();
        System.out.println(" I loved the color " + color);
        // The text " I loved the color " is a string literal

        // We can update the value in our variable "color" using the assignment operator
        color = "blue";
        System.out.println(" I also loved the color " + color);

        // This is a comment

        /*
        This is a multiline comment
        */

        /*
        Links
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
        https://math.hws.edu/javanotes/c2/s4.html#basics.4.6
        https://math.hws.edu/javanotes/c2/s2.html#basics.2.1%20
        https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#method_summary
        https://www.geeksforgeeks.org/variables-in-java/
         */
    }
}

