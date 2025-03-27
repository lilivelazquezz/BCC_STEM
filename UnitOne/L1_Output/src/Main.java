public class Main {
    public static void main(String[] args) {
        /*
        This is a source document. We run the source document using a compiler; the compiler checks for errors and creates a new Java bytecode file.
        Electronic gadgets have a Java virtual machine(JVM) that reads and runs the bytecode.

        If we have errors, the compiler will show the line number and a hint of the issue.
        The process of finding the errors to repair our code is called "debugging".
        */

        /* Commands are instructions for the computer. These instructions need to be precise, specific and organized */

         /*
        Method to print text:
        SYNTAX OF FIRST COMMAND
        System.out.println( ADD A STRING OR VARIABLE );
         *** Always use a semicolon at the end ; ***
         *** print tells the computer to display the information on the monitor.
         */

        // Prints in the same line
        System.out.print("Hello from "); // *** Always use quotation marks for strings ***
        System.out.print("the same line");

        // Prints in the next line
        System.out.println(" "); // empty string to print in the next line
        System.out.println("Hello from ");
        System.out.println("the next line");

        /* We can do math equations in Java using integers. */
        System.out.println(1 + 1);

        /* If you use quotations marks around the numbers, Java recognizes them as a String. */
        System.out.println("1 + 1");

        /* We can combine strings and integers using a concatenation with a + symbol between the strings and the integers and following the PEMDAS maths rules. */
        System.out.println("1 + 1 = " + (1 + 1));

        /* Two-step process(Compile and Run)
        When Java compiles, make sure to understand what we typed while checking for errors.
        When the program runs, it follows the instructions we typed in.
        */
        /* OTHER LINKS
        https://math.hws.edu/javanotes/c2/s4.html#basics.4
        https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html
        https://www.biography.com/scientist/grace-hopper
         */
    }
}