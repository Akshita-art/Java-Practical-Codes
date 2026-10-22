package com.java.test;

import java.util.Scanner;

public class ArrayJava {

	public static void main(String[] args) {

		String str = "HELLO";

		int a[] = new int[5];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your array");

		for(int i = 0; i < 5; i++)
		{
			a[i] = scanner.nextInt();
		}

		System.out.println("String characters and array values");

		for(int i = 0; i < 5; i++)
		{
			System.out.println(str.charAt(i) + " " + a[i]);
		}
	}
}