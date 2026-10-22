package com.java.test;
abstract class Animal {
    abstract void sound();
    
    void eat() {
        System.out.println("Animal eats food");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        
        d.sound();
        d.eat();
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
