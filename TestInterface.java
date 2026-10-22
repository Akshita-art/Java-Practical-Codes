package com.java.test;

interface Student
{
    public void name();
    public void systemid();
    public void course();
}

interface College
{
    public void collegeName();
    public void city();
}

class StudentDetails implements Student, College
{
    @Override
    public void name()
    {
        System.out.println("Name: Akshita");
    }

    @Override
    public void systemid()
    {
        System.out.println("System ID: 2025158169");
    }

    @Override
    public void course()
    {
        System.out.println("Course: B.Tech CSE");
    }

    @Override
    public void collegeName()
    {
        System.out.println("College: Sharda University");
    }

    @Override
    public void city()
    {
        System.out.println("City: Greater Noida");
    }
}

public class TestInterface
{
    public static void main(String[] args)
    {
        StudentDetails obj = new StudentDetails();

        obj.name();
        obj.systemid();
        obj.course();
        obj.collegeName();
        obj.city();
    }
}