package com.deepa.properties.singleton;

public class SingletonDemo
{ // Singleton class can create only one object
    public static void main(String[] args)
    {
        //System.out.println("hello");
        Singleton obj1= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();

        // All 3 reference variables obj1,obj2,obj3 are pointing to just one object.

    }


}
