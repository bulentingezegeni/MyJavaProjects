package com.company;

public class ArmstrongNumber {
    /* Check if the integer is an Armstrong numbers
       Armstrong number is a number that is equal to the sum of cubes of its digits.

         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        */
    public static void main(String[] args) {
        int num = 370;
        int digit;
        int sum = 0;

        for(int i=num; i>0; i=i/10) {
            digit = i%10;
            sum = sum + digit * digit * digit;
        }
        if (sum == num) {
            System.out.println(num+" is armstrong number");
        }else{
            System.out.println(num+" is not armstrong number");
        }

    }

}
