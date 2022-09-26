package com.deepa;
public class Wrapper1
{
    public static void main(String[] args)
    {
        int i=10;
        Integer obj1=Integer.valueOf(i); // i is primitive and obj1 is object.Integer is wrapper class for int
                                        // Integer.valueof() converts from primitive to object.
        System.out.println("Object1 value :" + obj1);

        Integer obj2=i; // Autoboxing , Here JVM or compiler internally converts primitive to object

        System.out.println("\n Object2 value: " + obj2);

    }
}
