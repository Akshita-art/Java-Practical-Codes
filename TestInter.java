package com.java.test;

interface Gmail
{
    public void name();
    public void password();
    public void zipcode();
}

interface Sharda
{
    int systemID();
    String stuname();
}

class UserMail implements Gmail, Sharda
{
    @Override
    public int systemID()
    {
        return 101;
    }

    @Override
    public String stuname()
    {
        return "Akshita";
    }

    @Override
    public void name()
    {
        System.out.println("Name: Akshita");
    }

    @Override
    public void password()
    {
        System.out.println("Password: 12345");
    }

    @Override
    public void zipcode()
    {
        System.out.println("Zipcode: 201310");
    }
}

public class TestInter
{
    public static void main(String[] args)
    {
        UserMail obj = new UserMail();

        obj.name();
        obj.password();
        obj.zipcode();

        System.out.println("System ID: " + obj.systemID());
        System.out.println("Student Name: " + obj.stuname());
    }
}

