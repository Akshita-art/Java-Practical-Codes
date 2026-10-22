package lab_file;
class Student {
    String name;
    int rollNo;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Akshita";
        student1.rollNo = 101;

        student1.displayDetails();
    }
}
