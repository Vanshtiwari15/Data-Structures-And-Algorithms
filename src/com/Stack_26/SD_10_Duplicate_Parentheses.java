package com.Stack_26;
import java.util.*;

public class SD_10_Duplicate_Parentheses{
    public static boolean isDuplicate(String str){ // O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // Duplicate
                } else{
                    s.pop(); // Opening Pair
                }
            } else{
                // Opening
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        // Valid String
        String str = "((a+b))"; // True
        String str2 = "(a-b)"; // False
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
