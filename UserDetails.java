package lab_file;
import java.util.Scanner;
class UserData {
    String username;
    int age;

    void display() {
        System.out.println("\nUser Details");
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
    }
}

public class UserDetails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        UserData s1 = new UserData();

        System.out.print("Enter your username: ");
        s1.username = input.nextLine();

        System.out.print("Enter your age: ");
        s1.age = input.nextInt();

        s1.display();

        input.close();
    }
}


