import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1.1
       // UnitOneLOne practiceOne = new UnitOneLOne();
       // System.out.println(practiceOne);

        //1.2 User Input and Variables.
       Scanner scan = new Scanner(System.in); // Do not make a comment of this line
       // UnitOneLTwo student = new UnitOneLTwo(scan);
       // student.getStudentName();

        // 1.3 Data Types.
       // UnitOneLThree miniMad = new UnitOneLThree(scan);
       // miniMad.getMadlibs();

        //1.4 Calculations
        UnitOneLFour calculator = new UnitOneLFour(scan);
        calculator.getCal();
    }
}
