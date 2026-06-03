import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1.1
        UnitOneLOne practiceOne = new UnitOneLOne();

        //1.2
        Scanner scan = new Scanner(System.in);
        UnitOneLTwo student = new UnitOneLTwo(scan);
        student.getStudentName();
    }
}