package lab_file;
import java.util.Scanner;

public class ScannerInputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your semester: ");
        int semester = input.nextInt();

        System.out.println("\nEntered Information");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);

        input.close();
    }
}
