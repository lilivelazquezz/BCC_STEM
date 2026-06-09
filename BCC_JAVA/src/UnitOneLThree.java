import java.util.Scanner;

public class UnitOneLThree { // Data Types
    private Scanner scan;
    //Constructor
    public UnitOneLThree(Scanner scan) {
        this.scan = scan;
    }
    /* Data types define what data a variable can store values
    and help Java use memory efficiently and perform operations correctly.
    Integer (int): Stores whole numbers without decimals. 4 bytes of memory, ranging from -2,147,483,648 to 2,147,483,647.
    Double (double): Decimal numbers, store numbers with precision. 8 bytes of memory.
    String (String): Reference data type. Stores text (characters, words, or sentences). It uses the String keyword and supports operations like concatenation with the + operator.
    Boolean (boolean): Takes up 1 bit of memory and represents true or false values.
    Constants: Variables whose values cannot be changed after being set, declared using the final keyword in Java. final double PI = 3.14; Integer.MAX_VALUE, Integer.MIN_VALUE.
     */

    public void getMadlibs() {
        // Reference or Class data types: String, Integers, Custom classes.
        System.out.print("What is your superhero name?");
        String userName = scan.nextLine();
        // Primitive data types: int, double, boolean.
        System.out.print("How many years have you been hiding on Earth?");
        int age = scan.nextInt();
        System.out.print("How many pet dinosaurs do you own?");
        int numberOfPets = scan.nextInt();
        System.out.print("Is it true or false?");
        boolean like = scan.nextBoolean();
        System.out.print("Can you confirm or change, true or false?");
        boolean secondLike = scan.nextBoolean();
        System.out.print("Type a number with decimals:");
        double battery = scan.nextDouble();

        System.out.println(" My name is "+ userName + ", and I am " + age +
                "\n I currently have " + numberOfPets +" pets, and things get interesting at home.\n It is "
                + like +" that my pet secretly plots world domination.\n It is " + secondLike +
                " that my favorite number has special powers.\n Oh noo! My battery is "
                + battery + "%. I hope I can make it to the end of the day. \n Life is normal… or at least I think it is.`");
    }
    /*
    Syntax Errors: Mistakes in Java code rules (e.g., missing semicolons), detected by the compiler.
    Logic Errors: The program runs but produces incorrect results due to faulty logic.
    Runtime Errors: Errors that occur during execution, such as exceptions, which can crash the program if not handled.
     */
    /*
    int 4 bytes (32 bits)
    double 8 bytes (64 bits)
    boolean JVM dependent (true or false)
    byte 1 byte (8 bits)
    short 2 bytes (16 bits)
    char 2 bytes (16 bits)
    float 4 bytes (32 bits)
    long 8 bytes (64 bits)
     */
    /*
    https://math.hws.edu/javanotes/c2/s2.html#basics.2.2
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */
}
