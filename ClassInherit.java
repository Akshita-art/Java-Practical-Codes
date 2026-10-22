package com.java.test;
class Car{
	public void fourTyres() {
		System.out.println("Four Tyres");
	}
}

class Mahindra extends Car
{
	public void airBags() {
		System.out.println("I have better airbags");
	}
}

class Bmw extends Mahindra
{
	public void speed() {
		System.out.println("I am reknown for speed");
	}
}

public class ClassInherit {
	public static void main(String[]args) {
		System.out.println("Hello");
		Bmw hi=new Bmw();
		hi.airBags();
		hi.fourTyres();
		hi.speed();
		
		
	}

}