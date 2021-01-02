package com.test.queues.queueChallenge;

import java.util.LinkedList;
import java.util.Locale;

public class queueChallengeMain {
    public static void main(String[] args) {

        String str = "aRorA";
        if (isPalindrome(str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean isPalindrome(String str){
        String lowercase = str.toLowerCase();
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c>='a'&&c<='z'){
                stack.push(c);
                queue.add(c);
            }
        }
        int flag = 0;
        while (!stack.isEmpty()){
            if (stack.pop()!=queue.remove())
            {flag=1;
                break;
            }
        }
        if (flag==0)
            return true;
        else
            return false;
    }
}
