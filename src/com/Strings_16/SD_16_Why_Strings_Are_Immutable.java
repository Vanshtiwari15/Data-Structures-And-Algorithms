package com.Strings_16;

public class SD_16_Why_Strings_Are_Immutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        } // abcdefghijklmnopqrstuvwxyz
        // O(26)
        // if we use str += ch then the T.C is O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
