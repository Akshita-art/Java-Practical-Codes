package com.java.test;
import java.util.Scanner;

class ClassOne {
    void display() {
        System.out.println("You called Class One.");
    }
}

class ClassTwo {
    void display() {
        System.out.println("You called Class Two.");
    }
}

public class Tester {

    static Scanner sc = new Scanner(System.in);

    static void chooseClass() {
        System.out.println("Enter your choice:");
        System.out.println("1. Call Class One");
        System.out.println("2. Call Class Two");

        int choice = sc.nextInt();

        if (choice == 1) {
            ClassOne obj1 = new ClassOne();
            obj1.display();
        } 
        else if (choice == 2) {
            ClassTwo obj2 = new ClassTwo();
            obj2.display();
        } 
        else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
            chooseClass(); // Calls the method again
        }
    }

    public static void main(String[] args) {
        chooseClass();
        sc.close();
    }
}