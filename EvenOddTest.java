package com.java.test;
import java.util.Scanner;
class Impl
{
	public String logicToReturn(int num)
	{
		if (num%2==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
}

public class EvenOddTest {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=scanner.nextInt();
		Impl i=new Impl();
		System.out.println(i.logicToReturn(a));
	}

}
