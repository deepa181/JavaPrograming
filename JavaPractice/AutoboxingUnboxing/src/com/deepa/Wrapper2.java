package com.deepa;

public class Wrapper2
{
    public static void main(String[] args) {
        Integer i = new Integer(10);  // ?
        int obj1 =i.intValue();
        System.out.println("Value of obj1 :"+ obj1);

        int j= i; // Unboxing
        System.out.println("Value of j :" + j);
    }
}
