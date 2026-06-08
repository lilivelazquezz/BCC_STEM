import java.util.Scanner;

public class UnitOneLFour {
    private Scanner scan;
    //Constructor
    public UnitOneLFour(Scanner scan) {
        this.scan = scan;
    }
    public void getCal() {
        System.out.println("Add a number:");
        int firstNumber = scan.nextInt();
        System.out.println("Add a second number smaller:");
        int secondNumber = scan.nextInt();

        // integers
        int addition = firstNumber + secondNumber; // +
        int subtraction = firstNumber - secondNumber; // -
        int multiplication = firstNumber * secondNumber; // *
        int division = firstNumber / secondNumber; // / Integer in the result. Trim result
        int modulus = firstNumber % secondNumber; // % remainder

        //doubles
        // Explicitly cast one of the integers(firstNumber) to a double to get the correct value
        double additionDouble = (double)firstNumber + secondNumber; // +
        double subtractionDouble = (double)firstNumber - secondNumber; // -
        double multiplicationDouble = (double)firstNumber * secondNumber; // *
        double divisionDouble = (double)firstNumber / secondNumber; // / Double gives a more exact result
        double modulusDouble = (double)firstNumber % secondNumber; // % remainder

        // Print integer result
        System.out.println("Dividing with an integer \naddition: " + addition + "\nsubtraction: " + subtraction + "\nmultiplication: " + multiplication + "\ndivision: " + division + "\nmodulus: " + modulus);
        // Print double result
        System.out.println("Dividing with a double \naddition: " + additionDouble + "\nsubtraction: " + subtractionDouble + "\nmultiplication: " + multiplicationDouble + "\ndivision: " + divisionDouble + " <-- Explicitly cast" + "\nmodulus: " + modulusDouble);

        // Multiplication, division, and remainder operations have higher priority than addition and subtraction. https://www.mathsisfun.com/operation-order-pemdas.html
        int x = 5;
        int pemdasNumberOne;
        int pemdasNumberTwo;

        pemdasNumberOne = x + firstNumber * secondNumber;
        pemdasNumberTwo = firstNumber * secondNumber + x;

        System.out.println( "5 + " + firstNumber + " * " + secondNumber + " = " + pemdasNumberOne + " -> Pemdas. Multiplication and division first");
        System.out.println(firstNumber + " * " + secondNumber +  " + 5  = " + pemdasNumberTwo + " -> Pemdas. Multiplication and division first");

        // Unary Operators:
        int firstNumberAddingOne = firstNumber;
        firstNumberAddingOne++; // adding one x = x + 1
        System.out.println("The first number is " + firstNumber + ", when i increment using ++ in the variable : " + firstNumberAddingOne);

        int firstNumberRemovingOne = firstNumber;
        firstNumberRemovingOne--; //subtracting one x = x - 1
        System.out.println("The first number is " + firstNumber + ", when i increment using -- in the variable : " + firstNumberRemovingOne);

        // Compound Assignment Operators (+=, -=, *=, /=, %=)
        int y = 4;
        y += 4; // adds 4 to the current value of y and stores the result back in y
        System.out.println(y + " is the value of y=4; after using y += 4 ");

        // We can apply to String too
        String text = "Hello";
        text += " AIMS!";
        System.out.println(text);
    }
    /*
    https://math.hws.edu/javanotes/c2/s5.html
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
    https://www.mathsisfun.com/operation-order-pemdas.html
     */
}
