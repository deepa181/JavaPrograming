package com.deepa.properties.singleton;

public class Singleton
{
    private Singleton()
    {
        //default constructor
    }

    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance == null) // check whether 1 obj is created or not
        {
            instance = new Singleton();
        }
        return instance;
    }
}
