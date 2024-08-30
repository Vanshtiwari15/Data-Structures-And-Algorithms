package com.Recursion_19;

public class SD_13_Remove_Dupicates {
    public static void removeDuplicated(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){ // map[currChar - 'a'] = Index
            // Duplicate
            removeDuplicated(str, idx+1, newstr, map);
        } else{
            map[currChar-'a'] = true; // currChar aya hi nahi hai to true de denge
            removeDuplicated(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicated(str, 0, new StringBuilder(), new boolean[26]);
    }
}
