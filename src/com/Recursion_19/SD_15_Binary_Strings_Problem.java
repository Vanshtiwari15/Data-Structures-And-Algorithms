package com.Recursion_19;

public class SD_15_Binary_Strings_Problem {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

//        // Kaam
//        if (lastPlace == 0) {
//            // Sit 0 on chair n
//            printBinStrings(n-1, 0, str.append("0"));
//            printBinStrings(n-1, 1, str.append("1"));
//        } else {
//            printBinStrings(n-1, 0, str.append("0"));
//        }

        printBinStrings(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 0, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0,"");
    }
}
