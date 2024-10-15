package com.Stack_26;
import java.util.*;

public class SD_09_Valid_Parentheses{
    public static boolean isValid(String str){ // O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){ // Opening
                s.push(ch);
            } else{
                // Closing
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek() == '(' && ch == ')' ) // ()
                || (s.peek() == '{' && ch == '}') // {}
                || (s.peek() == '[' && ch == ']') ) { // [] - Making Pairs
                    s.pop();
                } else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]"; // True
        // String str = "(({})[]"; // False
        System.out.println(isValid(str));
    }
}
