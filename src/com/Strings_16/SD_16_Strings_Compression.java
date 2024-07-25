package com.Strings_16;

public class SD_16_Strings_Compression {
    public static String compress(String str){
        String newstr = "";
        // aabc
        for(int i=0; i<str.length(); i++){ // T.C is------>O(n)
                Integer count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count++;
                    i++;
                }
                newstr += str.charAt(i);
                if(count > 1){
                    newstr += count.toString();
                }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaaabbbccd";
        // String str = "abcd";
        System.out.println(compress(str));
    }
}
