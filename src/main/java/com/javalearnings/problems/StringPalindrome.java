package com.javalearnings.problems;

public class StringPalindrome {
    public static void main(String[]args){
        String stringPalindrome = "malayalam";

        String reverseString = reverseString(stringPalindrome);
        if (stringPalindrome.equalsIgnoreCase(reverseString)){
            System.out.println(" palindrome :::"+stringPalindrome);

        }else{
            System.out.println("not palindrome :::"+stringPalindrome);
        }

    }

    private static String reverseString(String stringPalindrome) {
        char[] charArray = stringPalindrome.toCharArray();

        StringBuilder str = new StringBuilder();

        for(int i= charArray.length-1; i>=0; i--){
            System.out.println("  "+str.toString());
            str.append(charArray[i]);
        }

        return str.toString();
    }
}
