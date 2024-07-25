package com.Strings_16;

public class SD_16_String_Is_A_Palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // Not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar"; // Palindrome
        // String str = "Vansh"; // Not a Palindrome
        System.out.println(isPalindrome(str));
    }
}
