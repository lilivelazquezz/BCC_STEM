import java.util.Scanner;
public class UnitOneLTwo { // User Input and Variables
    private Scanner scan;

    //Constructor
    public UnitOneLTwo(Scanner scan) {
        this.scan = scan;
    }

    public void getStudentName() {
        // 1.2 Variables are the storage location that holds a value.
        // Syntax: Data Type, Name variable = value.
        //Assignment operator (=) initializes and assigns the value to the variable.
        //Primitive data types variables.
        int age = 16;
        double height = 5.9;

        //Class variables - reference data type - non-primitive data type. Starts with uppercase. String, Scanner.
        String school = "AMIS";

        System.out.println("Student name: ");

        String studentName = scan.nextLine(); //Method that enables your program to read input text and store it in studentName.
        System.out.println("Student name: " + studentName +  " is a student from " + school + " " + age + " years old, and " + height + " tall");
        scan.close();
    }
    /*
    https://math.hws.edu/javanotes/c2/s4.html#basics.4.6
    https://math.hws.edu/javanotes/c2/s2.html#basics.2.1%20
    https://www.cs.rutgers.edu/courses/111/classes/fall_2011_venugopal/texts/notes-java/data/variables/40variables.html
    https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#method_summary
    https://en.wikipedia.org/wiki/Standard_streams
     */
}
