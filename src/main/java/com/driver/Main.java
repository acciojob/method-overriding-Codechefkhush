package com.driver;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth()); // Invoking method from class A
        
        B objB = new B();
        System.out.println(objB.meth()); // Method is overridden in extended class B
    }
}
