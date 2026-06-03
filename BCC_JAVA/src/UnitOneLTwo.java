import java.util.Scanner;
public class UnitOneLTwo {
    private Scanner scan;

    //Constructor
    public UnitOneLTwo(Scanner scan) {
        this.scan = scan;
    }

    public void getStudentName() {
        // 1.2
        System.out.println("Student name: ");
        String studentName = scan.nextLine();
        System.out.println("Student name: " + studentName);
    }
}
