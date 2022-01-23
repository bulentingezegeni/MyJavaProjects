package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        /*
      Count the words in a String one by one

	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
      */
        String str = "Ali came to school and Ayse came to school";
        String [] words = str.split(" ");

        Map<String,Integer> numOfWords = new HashMap<>();

        for(String w: words) {
            if(numOfWords.containsKey(w)) {
                numOfWords.put(w, numOfWords.get(w)+1);
            }else {
                numOfWords.put(w, 1);
            }
        }
        System.out.println(numOfWords);

    }
}
