package com.company;

public class SwapNumbers {

    public static void main(String[] args) {
      /*
     Write a Java Program to swap two numbers
      */

        int a = 3;
        int b = 5;

        //1.Way:
        int temp=a;
        a= b;
        b=temp;
        System.out.println(" a = "+a+" ==> "+" b = "+b);

        //2.way:
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println(" a = "+a+" ==> "+" b = "+b);




    }

}
