package com.algorithms.stringManipulations;

public class StringRevarsal {
    public static void main(String[] args) {
        String s = "reverse";
        String revString = "";

        //Method1
        for(int i=s.length()-1;i>=0;i--){
            revString+=s.charAt(i);
        }
        System.out.println(revString);

        //Method2
        revString = new StringBuilder(s).reverse().toString();
        System.out.println(revString);
    }
}
