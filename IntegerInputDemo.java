package lab_file;
import java.util.Scanner;

public class IntegerInputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int number = input.nextInt();

        System.out.println("You entered: " + number);

        input.close();
    }
}
