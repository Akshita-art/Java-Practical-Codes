package com.java.test;

class Onee
{
    public int uAge(int age)
    {
        return age;
    }

    String uName()
    {
        String n = "user";
        return n;
    }
}

class Twoo
{
    double uHeight()
    {
        double h = 155.5;
        return h;
    }

    boolean isAdult(int age)
    {
        return age >= 18;
    }
}

public class hello   // Use the same name as your Java file
{
    public static void main(String[] args)
    {
        Onee obj1 = new Onee();
        Twoo obj2 = new Twoo();

        int age = obj1.uAge(18);

        System.out.println("Age = " + age);
        System.out.println("Name = " + obj1.uName());
        System.out.println("Height = " + obj2.uHeight());
        System.out.println("Is Adult? " + obj2.isAdult(age));
    }
}