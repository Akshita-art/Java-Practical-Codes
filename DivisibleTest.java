package com.java.test;

class Zert
{
    public void logicToReturn()
    {
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for(int i = 20; i <= 40; i++)
        {
            if(i % 2 == 0)
            {
                count2++;
            }

            if(i % 3 == 0)
            {
                count3++;
            }

            if(i % 4 == 0)
            {
                count4++;
            }
        }

        System.out.println("Numbers divisible by 2 = " + count2);
        System.out.println("Numbers divisible by 3 = " + count3);
        System.out.println("Numbers divisible by 4 = " + count4);
    }
}

public class DivisibleTest
{
    public static void main(String[] args)
    {
        Zert i = new Zert();
        i.logicToReturn();
    }
}