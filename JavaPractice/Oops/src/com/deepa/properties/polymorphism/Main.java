package com.deepa.properties.polymorphism;

public class Main
{
    public static void main(String[] args) {
        //Shapes shape = new Shapes();
        Shapes circle = new Circle(); // method call depends on  the type of the object being referred to
        // (not the type of the reference variable)
        //Shapes square = new Square();

        circle.area(); //call area() of shapes if area() is not present in Circle class
    }
}
