package HackerRankPrep;

/*
Minimal moves to form a string by adding characters or appending string itself
Given a string S, we need to write a program to check if it is possible to construct the given string S by performing any of the below operations any number of times. In each step, we can:

Add any character at the end of the string.
or, append the string to the string itself.
The above steps can be applied any number of times. We need to write a program to print the minimum steps required to form the string.

Examples:

Input : aaaaaaaa
Output : 4
Explanation: move 1: add 'a' to form "a"
move 2: add 'a' to form "aa"
move 3: append "aa" to form "aaaa"
move 4: append "aaaa" to form "aaaaaaaa"
*
* */

import java.util.Scanner;


public class Minimal_Moves {

    public static void foo(String s) {
        int n = s.length();
        int[] dp = new int[n];



    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = "aaaaaaaa";
        //String s = scan.nextLine();
        //System.out.println(s);





    }


}
