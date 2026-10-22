package com.java.test;

class AWetyr
{
    public void logicToReturn()
    {
        System.out.println("Numbers divisible by 2");
        for(int i = 20; i <= 40; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Numbers divisible by 3");
        for(int i = 20; i <= 40; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Numbers divisible by 4");
        for(int i = 20; i <= 40; i++)
        {
            if(i % 4 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

public class DivisibilityTest
{
    public static void main(String[] args)
    {
    	AWetyr i = new AWetyr();
        i.logicToReturn();
    }
}