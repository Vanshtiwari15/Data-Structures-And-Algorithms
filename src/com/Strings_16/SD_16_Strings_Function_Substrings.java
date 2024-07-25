package com.Strings_16;

public class SD_16_Strings_Function_Substrings {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // Substring
        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5)); //  The substring function that we make
        System.out.println(str.substring(0, 5)); // The substring function that already exists in java
    }
}
