package com.java.test;
import java.util.Scanner;
public class TestException {
	public static void main(String[] args) {
		System.out.println("Enter your numbers");
		int a,b;
		Scanner scanner=new Scanner(System.in);
		
			a=scanner.nextInt();
			try
			{
			b=scanner.nextInt();
			System.out.println(a/b);
		}
		catch (Exception abc) {
			System.out.println("proper input daal na "+abc);
		}
			
	}

}
