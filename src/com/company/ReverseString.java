package com.company;

public class ReverseString {

    public static void main(String[] args) {
/*
        Write a java program to reverse the string          */
        String str = "Jonathan";

        String reString = "";

        for (int i = 0; i < str.length(); i++) {
            reString += str.charAt(str.length() - i - 1);
        }

        System.out.println(reString);

        // Reverse String with string builder
        StringBuilder stringBuilder = new StringBuilder("Jonathan");
        System.out.println(stringBuilder.reverse());
    }
}
