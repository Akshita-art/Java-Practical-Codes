package com.java.test;

class Carr {
	public void fourTyres() {
		System.out.println("Four Tyres");
	}
	public void show() {
		System.out.println("this is a car.");
}

}
class Mahindraa extends Carr {
	public void airBags() {
		System.out.println("I have better airbags");
	}
}

class Bmww extends Mahindraa {
	public void speed() {
		System.out.println("I am reknown for speed");
	}
}

public class Classinheri {
	public static void main(String[] args) {
		Carr newCarr; 
		newCarr= new Carr(); 
		System.out.println(newCarr); 
		newCarr .show();
	}
}