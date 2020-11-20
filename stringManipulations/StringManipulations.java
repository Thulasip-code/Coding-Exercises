package com.algorithms.stringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulations {
    public static void main(String[] args) {

        /**String Comparisions **/
        String s1 = "sample1";
        String s2 = "2sample2";
        if(s1.equals(s2))
            System.out.println("Both strings are equal");
        else
            System.out.println("s1 and s2 are not equal");


        /**
         * Capitalize first letter of each word in string except "of"
         */
        s1 = "united states of america";
        StringBuilder sBuilder = new StringBuilder();
        List<String> sList = new ArrayList<String>(Arrays.asList(s1.split(" ")));
        for(String s: sList){

            if(!s.equals("of"))
                s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            sBuilder.append(s + " ");
        }
        s1 = sBuilder.toString().trim();
        System.out.println("Capitalized text is : " + s1);


        /**
         * String Concatenation
         */
        s1 = "sample1";
        s2 = "2sample2";
        String result = "";
        //Method1
        result = s1 + " " + s2;

        //Method2
        result = s1.concat(" " + s2);


        /**
         * Check if a given string is palindrome
         */
        s1 = "kayak";
        String revString = "";
        for(int i=s1.length()-1;i>=0;i--){
            revString += s1.charAt(i);
        }

        if(s1.equals(revString))
            System.out.println("s1 is a palindrome");
        else
            System.out.println("s1 is not a palindrome");


        /**
         *
         */

    }
}
