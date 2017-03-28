package com.wins;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Dainish on 3/12/17.
 */
public class palindrome {
    public static void main(String args[])
    {
//        String original, reverse = "";
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter a string to check if it is a palindrome");
//        original = in.nextLine();

        String original = "Noon";

        System.out.println(isPalindrome(original) ? "Palindrome" : "Not a Palindrome");

    }

    public static boolean isPalindrome(String original) {
        String reverse = "";
        for ( int i = original.length() - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        return original.equals(reverse);
    }
}
