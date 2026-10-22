package lab_file;
import java.util.Scanner;

public class TextInputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Hello, " + fullName + "!");

        input.close();
    }
}


