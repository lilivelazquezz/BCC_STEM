import java.util.Scanner;
public class UnitOneLSix {

// Constructor
    private Scanner scan;
    UnitOneLSix( Scanner scan ){
        this.scan = scan;
    }

    public void getNumbers(){
/* Numeric Casting: The process of converting a primitive numeric data type into another numeric type*/
/* The Java compiler handles this conversion without any manual code. Safety: Safe to perform because it transfers data from a smaller type to a larger type size, meaning no data loss occurs.*/
// Widening:  byte -> short -> char -> int -> long -> float -> double
    int myIntOne = 9;
    double myDoubleOne = myIntOne;
    System.out.println(myDoubleOne + " Casting; review comments.");

/* Potential for data loss (either in magnitude or precision) means Java requires explicit instruction to perform this conversion. Requires an explicit cast operator, which is the target type in parentheses: (targetType).*/
// Narrowing: double -> float -> long -> int -> char -> short -> byte
    double myDoubleTwo = 9.78;
    int myIntNumTwo = (int) myDoubleTwo;
    System.out.println(myIntNumTwo + " Narrowing; review comments.");
/* Truncation: Drops everything to the right of the decimal point—it effectively rounds toward zero, whether positive or negative.*/
    double myDoubleThree = 9.99;
    int myIntNumThree = (int) myDoubleThree; // Result: 9 . Rounds down
        System.out.println(myIntNumThree + " Truncation; review comments.");

// Rounding: The Math.round() method mathematically rounds to the nearest whole number
    double roundedMyDoubleThree = Math.round(myDoubleThree); // Result: 10. Round up
    System.out.println(roundedMyDoubleThree + " Math.round() method; review comments.");

// Integer Division
/* If you divide two integers and cast the final result to a double, you will still lose the decimal part because the division is calculated first.
* Integer division, discarding the fractional remainder entirely. */
    int dividend = 5;
    int divisor = 2;

// Integer division: 5 / 2 = 2
    int intResult = dividend / divisor;
    System.out.println(intResult + " Integer division; review comments.");

// Floating-point division: 5.0 / 2 = 2.5
    double doubleResult = (double) dividend / divisor;
    System.out.println(doubleResult + " Correct result; review comments.");

// Incorrect method: cast happens AFTER integer division
    double wrongResult = (double) (dividend / divisor); // Result: 2.0
    System.out.println(wrongResult + " Wrong result; review the comments.");
    }
}
