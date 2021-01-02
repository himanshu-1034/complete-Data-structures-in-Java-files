package com.test.stacks.stackChallenge;

import java.util.LinkedList;
import java.util.Locale;

public class stackMain {

    public static void main(String[] args) {
        String s = "madam mad,am";
    if (isPalindrome(s)) System.out.println("YES");
    else System.out.println("NO");


    }
    public static boolean isPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder(string.length());
        String lowercasestring = string.toLowerCase();

        for (int i = 0; i < lowercasestring.length(); i++) {
            if (lowercasestring.charAt(i)>='a'&&lowercasestring.charAt(i)>='z'){
                stack.push(lowercasestring.charAt(i));
                stringBuilder.append(lowercasestring.charAt(i));
            }

        }
        StringBuilder reversedstring = new StringBuilder(stack.size());

        while (!stack.isEmpty()){
            reversedstring.append(stack.pop());
        }

        if (reversedstring.toString().equals(stringBuilder.toString())) return true;
        else return false;


    }
}
