package com.java.test;
import java.util.Scanner;

class Noob
{
	public int calculateSoD(int num)
{
	int sum=0;
	for(;num>0;)
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
}
}
public class SumOfDigit {
	public static void main(String[] args) {
		Noob test=new Noob();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int a=scanner.nextInt();
		System.out.println(test.calculateSoD(a));
		
	}

}
