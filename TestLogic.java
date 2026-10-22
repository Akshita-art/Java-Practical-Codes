package com.java.test;

import java.util.Scanner;

public class TestLogic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {

                if (a[i] > a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}