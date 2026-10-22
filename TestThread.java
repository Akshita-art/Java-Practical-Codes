package com.java.test;

class Person1 extends Thread
{
	public void run() 
	{	
		try
		{
			for(int i=0;i<10;i++)
			{	
				Thread.sleep(500);
				System.out.println("running p1");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Stopped 1"+e);
		}
	}
}

class Person2 extends Thread
{
	public void run() 
	{	
		try
		{
			for(int i=0;i<10;i++)
			{	
				Thread.sleep(500);
				System.out.println("running p2");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Stopped 2"+e);
		}
	}
}


public class TestThread {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();

        p1.start();
        p2.start();
    }
}

