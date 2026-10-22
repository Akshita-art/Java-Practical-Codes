package com.java.test;
import java.util.Scanner;

class Nob
{
	public int RON(int num)
{
	int sum=0;
	for(;num!=0;)
	{
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	return sum;
}
}
public class ReverseOfNum {
	public static void main(String[] args) {
		Nob test=new Nob();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int a=scanner.nextInt();
		System.out.println(test.RON(a));
		
	}

}
