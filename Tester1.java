package com.java.test;

import java.util.Scanner;

class One
{
    public void mt1()
    {
        System.out.println("Call Mt1");
        System.out.println(0 % 10);
    }
}

class Two
{
    public static void mt2()
    {
        System.out.println("Call Mt2");
    }
}

public class Tester1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter choice");
        int choice = scanner.nextInt();

        if(choice == 1)
        {
            One one = new One();
            one.mt1();
        }
        else if(choice == 2)
        {
            Two.mt2();
        }
        else
        {
            main(args);
        }

        scanner.close();
    }
}