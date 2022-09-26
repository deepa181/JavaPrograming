package com.deepa;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    private static Scanner sc = new Scanner(System.in);
    private static int[] basedata=new int[5];
    public static void main(String[] args)
    {
        System.out.println("Enter 5 integers: ");
        getInput();
        System.out.println("Print entered elements: ");
        print(basedata);
    }
    private static void getInput()
    {
        for(int i=0; i< basedata.length; i++)
        {
            basedata[i]=sc.nextInt();
        }
    }
    private static void print(int[] arr)
    {
//        for(int i=0; i< arr.length; i++)
//        {
//            System.out.println(arr[i] + " ");
//            System.out.println();
//        }
        System.out.println(" Arrays = " + Arrays.toString(arr)); // o/p Arrays = [1,2,5,6,7]
    }
}