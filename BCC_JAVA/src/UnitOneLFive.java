import java.util.Scanner;
public class UnitOneLFive {
    private Scanner scan;
    // constructor
    public UnitOneLFive(Scanner scan) {
        this.scan = scan;
    }
    /* SYNTAX: int result = dividend % divisor;
        - Use the percent sign (%) operator

        Handling Errors:
        - *** 10 % 0 caused throw en exception "ArithmeticException: / by zero"
        - *** 10.0 % 0.0 = NaN
        Expression	Result
        10 % 0	    Throws ArithmeticException
        10 / 0	    Throws ArithmeticException
        10.0 % 0.0	NaN
        10.0 / 0.0	Infinity
        0.0 / 0.0	NaN

        Uses:
        → Patterns
        → Determine even and odd numbers
        → Time Calculations
        → Money
        → Online Encryption
        → Animation in video games
        Note: The % operator is most commonly applied to integers.
         */

    public void getRemainder() {
        System.out.print("Add an integer number: ");
        int numOne = scan.nextInt();
        System.out.print("Add a second integer number: ");
        int numTwo = scan.nextInt();
        int evenOddOne = numOne % 2;
        int evenOddTwo = numTwo % 2;
        System.out.println(numOne + "/" +numTwo + ": the remainder is: " + numOne % numTwo);
        System.out.println( "The first number is " + numOne + ", if the remainder is 1, means is odd; if the remainder is 0, means is even. This number is: " + evenOddOne );
        System.out.println( "The second number is " + numTwo + ", if the remainder is 1, means is odd; if the remainder is 0, means is even. This number is: " + evenOddTwo );
        System.out.println( "Ones digit for the first number is: " + numOne % 10);
        System.out.println( "Ones digit for the second number is: " + numTwo % 10);
    }
/*
        https://en.wikipedia.org/wiki/Modulo
        https://www.cafeaulait.org/course/week2/15.html
        https://math.hws.edu/javanotes/c2/s5.html#basics.5.1
 */

}
