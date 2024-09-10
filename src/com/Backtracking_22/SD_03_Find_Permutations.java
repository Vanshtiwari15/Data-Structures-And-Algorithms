package com.Backtracking_22;

public class SD_03_Find_Permutations {
    public static void findPermutations(String str, String ans){
        // Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Recursion - O(n * n!)
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "Abcde" => "Ab" + "de" = "Abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
